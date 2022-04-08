package com.example.tarotback.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game")
    private Game game;

    private List<Score> scores;

    private Player taker;



}
