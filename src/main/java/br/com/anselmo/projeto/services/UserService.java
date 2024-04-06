package br.com.anselmo.projeto.services;

import org.springframework.stereotype.Service;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.anselmo.projeto.repositories.UserRepository;
import br.com.anselmo.projeto.dto.UserDTO;
import br.com.anselmo.projeto.entities.User;
import br.com.anselmo.projeto.exceptions.ResourceNotFoundException;
import java.util.List;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserDTO::new).toList();
    }
	
	public UserDTO findById(Long id) {
        return new UserDTO(userRepository.findById(id).get());
    }
	
	public void insert(UserDTO userDTO) {
        User user = new User(userDTO);
        userRepository.save(user);
    }

	public UserDTO update(UserDTO userDTO) {       
        try {
        	User user = new User(userDTO);
            return new UserDTO(userRepository.save(user));
        } catch (DataIntegrityViolationException e) {
            throw new ResourceNotFoundException("User not found with id: " + userDTO.getId());
        }
    }
	
	public void delete(Long id) {		
		try {
			User user = userRepository.findById(id).get();
			userRepository.delete(user);
	    } catch (EmptyResultDataAccessException e) {
	        throw new ResourceNotFoundException("User not found with id: " + id);
	    }
    }
}
