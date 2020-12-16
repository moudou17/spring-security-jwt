package com.bouajila.jwt.api;

import com.bouajila.jwt.api.entity.User;
import com.bouajila.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExempleApplication {
    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void initUsers(){
        List<User> users = Stream.of(
                new User (101, "user1", "pw1", " user1@yahoo.fr"),
                new User (102, "user2", "pw2", " user2@gmail.com"),
                new User (103, "user3", "pw3", " user3@gmail.com")
        ).collect(Collectors.toList());
        userRepository.saveAll(users);
    }
    public static void main(String[] args) {

        SpringApplication.run(SpringSecurityJwtExempleApplication.class, args);
    }

}
