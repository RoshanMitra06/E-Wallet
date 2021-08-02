package com.example.UserService.Controller;

import com.example.UserService.Exception.UserNotFoundException;
import com.example.UserService.Model.User;
import com.example.UserService.Repository.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class UserResource {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Autowired
    UserRepository repository;

    @ApiOperation(value="find all the user")
    @GetMapping("/users")
    List<User> findAll(){
        return repository.findAll();
    }

//    @ApiOperation(value ="Register a new User")
//    @PostMapping("/AddAUser")
//    User newUser() {
//        return newUser();
//    }

    @ApiOperation(value ="Register a new User")
    @PostMapping("/AddAUser")
    User newUser(@RequestBody User u){
        return repository.save(u);
    }

    @ApiOperation(value = "Find user by ID")
    @GetMapping("//users/{id}")
    User find(@PathVariable int id){
        LOGGER.info("/users/{id} called with id "+ id);
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }


}
