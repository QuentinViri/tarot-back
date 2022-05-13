package com.example.tarotback;

import com.example.tarotback.model.ERole;
import com.example.tarotback.model.Role;
import com.example.tarotback.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TarotBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(TarotBackApplication.class, args);
    }
    @Bean
    public CommandLineRunner rolesLiner(RoleRepository roleRepository) {
        return (args) -> {
            // save a couple of customers
            List<Role> data = roleRepository.findAll();
            if (data.size() == 0) {
                roleRepository.save(new Role(ERole.ROLE_USER));
                roleRepository.save(new Role(ERole.ROLE_MODERATOR));
                roleRepository.save(new Role(ERole.ROLE_ADMIN));
            }
        };
    }

}
