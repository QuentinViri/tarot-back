package com.example.tarotback.model;

import lombok.Data;
import org.apache.logging.log4j.message.StringFormattedMessage;

import javax.persistence.*;

@Entity
@Data
public class Declaration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EDeclaration eDeclaration;
}
