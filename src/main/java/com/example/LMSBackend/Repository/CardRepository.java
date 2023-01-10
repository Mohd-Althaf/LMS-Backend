package com.example.LMSBackend.Repository;

import com.example.LMSBackend.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
