package org.example.tp_todo_spring_react_jwt.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_todo_spring_react_jwt.model.Role;
import org.example.tp_todo_spring_react_jwt.model.Todo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
    private Long IdRole;
   // private Set<Role> Roles = new HashSet<>();
    private List<Todo> todos;

}
