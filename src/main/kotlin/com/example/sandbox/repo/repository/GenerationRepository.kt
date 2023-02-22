package com.example.sandbox.repo.repository

import com.example.sandbox.entity.Generation
import org.springframework.data.jpa.repository.JpaRepository

interface GenerationRepository: JpaRepository<Generation, Int> {
}