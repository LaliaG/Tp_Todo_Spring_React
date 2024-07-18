package org.example.tp_todo_spring_react_jwt.dto.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDtoGet {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
