package com.dlq.webflux.handler;

import com.dlq.webflux.entity.User;
import com.dlq.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *@program: UserController
 *@description:
 *@author: Hasee
 */
@RestController
public class UserController {

    //注入service
    @Autowired
    private UserService userService;

    //id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    //查询所有
    @GetMapping("/user")
    public Flux<User> getUsers(){
        return userService.getAllUser();
    }

    //添加用户
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }

}
