package org.example.tp_todo_spring_react_jwt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_todo_spring_react_jwt.utils.StatusTodo;

@Entity
@Table(name = "todos")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private StatusTodo status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="user_id")
    @JsonIgnore
    private User user;
}
