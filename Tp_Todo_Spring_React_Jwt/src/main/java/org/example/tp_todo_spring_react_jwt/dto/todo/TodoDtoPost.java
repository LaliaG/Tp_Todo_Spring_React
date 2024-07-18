package org.example.tp_todo_spring_react_jwt.dto.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDtoPost {
    private Long userId;
    private String title;
    private String description;
    private boolean completed;
}
