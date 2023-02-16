package ru.hits.hitsback.timetable.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Entity
@Table(name = "group")
public class Group {
    @Id
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String number;
    @Getter @Setter
    @OneToMany
    private Set<User> user;

    public Group() {
    }
}
