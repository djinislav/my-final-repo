package com.movielibrary.service;

import com.movielibrary.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Movie entity
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // You can define custom query methods here.
    // JpaRepository provides methods like save(), findById(), findAll(), deleteById(), etc.
}