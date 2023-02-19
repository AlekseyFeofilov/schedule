package ru.hits.hitsback.timetable.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;
@Entity
@Table(name = "teacher")
@Getter @Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private String lastName;
    private String patronymic;
    @OneToMany
    private Set<Lesson> lessons;

    public Teacher() {
    }
}
