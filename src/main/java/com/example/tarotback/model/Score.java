package com.example.tarotback.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Player player;

    @OneToOne
    private Round round;

    private Integer points;

    private EAnnouncement eAnnouncement;


}
