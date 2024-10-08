package com.gerenciamento.gerencia.resource;

import com.gerenciamento.gerencia.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Lucas","lucas@project.com","51999999999","12ab3");
        return ResponseEntity.ok().body(u);
    }
}
