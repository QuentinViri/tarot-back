package com.example.tarotback.model;

import javax.persistence.*;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Player player;

    @OneToOne
    private Round round;

    private Integer number;

}
