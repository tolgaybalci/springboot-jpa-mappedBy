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
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long universityId;

    @Column
    private String universityName;

    @Column
    private String universityAdress;

    @OneToMany(mappedBy = "university")
    private List<Student> students;

    @OneToMany(mappedBy = "university")
    private List<Department> departments;
}
