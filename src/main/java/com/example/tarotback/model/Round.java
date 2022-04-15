package com.example.tarotback.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game")
    private Game game;

    @OneToMany
    @JoinColumn(name = "scores")
    private List<Score> scores;

    @OneToOne
    @JoinColumn(name = "taker")
    private Player taker;

    @OneToOne
    @JoinColumn(name = "called")
    private Player called;

    @OneToMany
    @JoinColumn(name = "declarations")
    private List<Declaration> declarations;

}
