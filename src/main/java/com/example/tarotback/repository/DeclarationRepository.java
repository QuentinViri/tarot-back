package com.example.tarotback.repository;

import com.example.tarotback.model.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Long> {
}
