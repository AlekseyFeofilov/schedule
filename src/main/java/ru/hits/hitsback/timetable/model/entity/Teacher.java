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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String lastName;
    private String patronymicName;
    @OneToMany
    private Set<Lesson> lessons;
    @OneToOne
    private Account account;


    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String patronymicName, Set<Lesson> lessons, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.lessons = lessons;
        this.account = account;
    }
}