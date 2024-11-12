package com.project.esd_web.controllers;
import java.security.Principal;
import java.util.List;
import com.project.esd_web.models.User;
import com.project.esd_web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")

//http://localhost:8080/home/users
public class homeController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getUsers() {
        System.out.println("Welcome to the home page");
        return userService.getUsers();
    }

    @GetMapping("/curuser")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}
