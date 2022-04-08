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

    @OneToMany
    private List<Score> scores;

    @OneToOne
    private Player taker;

    @OneToOne
    private Player called;

    @ManyToOne
    private List<EDeclaration> eDeclarations;




}
