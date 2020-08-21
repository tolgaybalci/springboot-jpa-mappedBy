package com.tolgaybalci.crudexample.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Student> students;

    @ManyToOne(optional = false)
    @JoinColumn(name = "university_id")
    private University university;

    @OneToMany(mappedBy = "department")
    private List<Lesson> lessons;
}
