package com.example.tarotback.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Oudlers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private EOudlers eOudlers;

}
