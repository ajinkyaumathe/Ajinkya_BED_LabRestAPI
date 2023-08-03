package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.dto.UserDto;
import com.example.studentmanagementsystem.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
