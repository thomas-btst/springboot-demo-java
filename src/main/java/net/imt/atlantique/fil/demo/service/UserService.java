package net.imt.atlantique.fil.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import net.imt.atlantique.fil.demo.domain.User;
import net.imt.atlantique.fil.demo.mapper.UserMapper;
import net.imt.atlantique.fil.demo.repository.UserRepository;
import net.imt.atlantique.fil.demo.web.dto.user.CreateOrUpdateUserDto;
import net.imt.atlantique.fil.demo.web.dto.user.UserDto;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public void addUser(CreateOrUpdateUserDto userDto) {
        userRepository.save(userMapper.toUser(userDto));
    }

    public List<UserDto> listUsers() {
        return userRepository
            .findAll()
            .stream()
            .map(userMapper::toUserDto)
            .collect(Collectors.toList());
    }

    public UserDto getUser(String userId) {
        User user = userRepository
            .findById(userId)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return userMapper.toUserDto(user);
    }

    public void updateUser(String userId, CreateOrUpdateUserDto userDto) {
        userRepository.save(userMapper.toUser(userId, userDto));
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
