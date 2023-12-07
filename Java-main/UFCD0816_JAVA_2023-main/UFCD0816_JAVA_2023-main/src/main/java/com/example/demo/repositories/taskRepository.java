package com.example.demo.repositories;

import com.example.demo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<Task, Long> {
    // Métodos personalizados, se necessário
}
