package main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private LocalDateTime creationTime = LocalDateTime.now();

    private Boolean isDone = false;

    private String title;
    private String description;

    @Override
    public String toString() {
        return "{" +
                "id:" + id + ",\n" +
                "creationTime:" + creationTime + ",\n" +
                "isDone:" + isDone + ",\n" +
                "title:" + title + ",\n" +
                "description:" + description + "\n" +
                "}";
    }
}
