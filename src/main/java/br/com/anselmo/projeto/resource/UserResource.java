package br.com.anselmo.projeto.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.anselmo.projeto.dto.UserDTO;
import br.com.anselmo.projeto.services.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<UserDTO> findAll() {
		return userService.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody UserDTO userDTO) {
		userService.insert(userDTO);
    }	
	
	@PutMapping
	public UserDTO update(@RequestBody UserDTO userDTO) {        
        return userService.update(userDTO);
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id")Long id) {        
        userService.delete(id);        
        return ResponseEntity.ok().build();
    }

}