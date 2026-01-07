package com.example.toDo.repositories;

import com.example.toDo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
