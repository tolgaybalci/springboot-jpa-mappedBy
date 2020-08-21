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
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    @Lob
    private String adress;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @OneToMany(mappedBy = "student")
    private List<Lesson> lessons;

    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id")
    private Department department;


}
