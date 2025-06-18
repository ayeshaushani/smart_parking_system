package org.example.user_service.service;


import org.example.user_service.dto.UserDTO;

import java.util.List;

public interface UserService {
    int saveUser(UserDTO user);

    int updateUser(UserDTO user);

    int deleteUser(String email);

    List<UserDTO> getAll();

    UserDTO getUserByEmail(String email);
}
