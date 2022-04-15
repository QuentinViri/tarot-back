package com.example.tarotback.repository;

import com.example.tarotback.model.Oudlers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OudlersRepository extends JpaRepository<Oudlers, Long> {
}
