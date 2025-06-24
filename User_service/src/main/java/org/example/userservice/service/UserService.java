package org.example.userservice.service;

import org.example.userservice.dto.UserDTO;

import java.util.List;

public interface UserService {
    int saveUser(UserDTO user);

    int updateUser(UserDTO user);

    int deleteUser(String email, String password);

    List<UserDTO> getAll();

    UserDTO getUserByEmail(String email);
}
