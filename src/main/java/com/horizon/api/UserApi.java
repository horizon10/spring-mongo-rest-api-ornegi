package com.horizon.api;

import com.horizon.entity.User;
import com.horizon.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    UserRepository userRepository;

    //örnek olarak görebilmek için kullanıcı ekledik
    @PostConstruct
    public void init(){
        User user = new User();
        user.setName("Jack");
        user.setSurname("wick");
        userRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }

}
