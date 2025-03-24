package sit.int210.docker_backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.int210.docker_backend.entities.User;
import sit.int210.docker_backend.services.UserService;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getUserService() {
        return userService.findAll();
    }
}
