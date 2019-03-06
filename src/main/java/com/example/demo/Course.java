package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String faculity;
    private long creditHr;
    private String coursename;

    @ManyToMany
    private Set<Student> grade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFaculity() {
        return faculity;
    }

    public void setFaculity(String faculity) {
        this.faculity = faculity;
    }

    public long getCreditHr() {
        return creditHr;
    }

    public void setCreditHr(long creditHr) {
        this.creditHr = creditHr;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Set<Student> getGrade() {
        return grade;
    }

    public void setGrade(Set<Student> grade) {
        this.grade = grade;
    }
}
