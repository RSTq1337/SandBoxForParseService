package com.example.sandbox.repo.repository

import com.example.sandbox.entity.Model
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ModelRepository: JpaRepository<Model, Int> {
}