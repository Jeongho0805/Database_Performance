package com.project.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id")
    private Long id;

    private String name;

}
