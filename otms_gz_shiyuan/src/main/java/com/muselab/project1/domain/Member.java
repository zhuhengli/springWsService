package com.muselab.project1.domain;

import javax.persistence.*;

/**
 * Created by 1002428 on 16. 1. 3..
 */
@Entity
@Table(name="Member1")
public class Member {


    @Id
    @GeneratedValue
    @Column(name="id") 
    private Long id;

    
    @Column(name="name")
    private String name;

    
    @Column(name="age")
    private int age;



    public Member() {
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }
}
