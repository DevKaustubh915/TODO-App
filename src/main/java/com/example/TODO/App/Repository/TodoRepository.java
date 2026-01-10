package com.example.TODO.App.Repository;

import com.example.TODO.App.Entity.TodoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity , Long> {
}
