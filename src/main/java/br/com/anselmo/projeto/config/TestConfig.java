package br.com.anselmo.projeto.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import br.com.anselmo.projeto.entities.User;
import br.com.anselmo.projeto.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
    	
    	//User u1 = new User(1, "Maria Brown", "maria@gmail.com", "988888888", "123456");
    	//User u2 = new User(2, "Alex Green", "alex@gmail.com", "977777777", "123456");
    	//userRepository.saveAll(Arrays.asList(u1, u2));
    	
    }
}