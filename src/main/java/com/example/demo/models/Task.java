package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private boolean isCompleted;

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    // Constructors
    // Other necessary methods
}


/* package com.example.demo.models;

@jakarta.persistence.Entity
public class Task {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String description;
    private boolean iscompleted;

    // Getters and setters
    public String getDescription() {
        return description;
    }
    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // Constructors
    // Other necessary methods
    public Object isCompleted() {
        return null;
    }
    public void setCompleted(Object completed2) {
    }
} */
