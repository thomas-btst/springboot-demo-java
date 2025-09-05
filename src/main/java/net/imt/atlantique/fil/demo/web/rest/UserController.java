package net.imt.atlantique.fil.demo.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.imt.atlantique.fil.demo.service.UserService;
import net.imt.atlantique.fil.demo.web.dto.user.CreateOrUpdateUserDto;
import net.imt.atlantique.fil.demo.web.dto.user.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@RequestBody CreateOrUpdateUserDto userDto) {
        userService.addUser(userDto);
    }

    @GetMapping
    public List<UserDto> listUsers() {
        return userService.listUsers();
    }

    @GetMapping("/{userId}")
    public UserDto getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    public void updateUser(@PathVariable String userId, @RequestBody CreateOrUpdateUserDto userDto) {
        userService.updateUser(userId, userDto);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }
}
