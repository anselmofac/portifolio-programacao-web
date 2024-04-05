package br.com.anselmo.projeto.dto;

import org.springframework.beans.BeanUtils;
import br.com.anselmo.projeto.entities.User;

public class UserDTO {	

	private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String password;
    
    
    public UserDTO(User user) {
    	BeanUtils.copyProperties(user, this);
    }
    
    public UserDTO() {
    	
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}    

}