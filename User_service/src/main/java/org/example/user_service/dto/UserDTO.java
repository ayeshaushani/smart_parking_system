package org.example.user_service.dto;

import lombok.*;
import org.example.user_service.entity.UserRole;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserDTO {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private UserRole role;
    private Date createdAt;
}
