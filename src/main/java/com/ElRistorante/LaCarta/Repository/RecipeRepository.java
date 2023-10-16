package com.ElRistorante.LaCarta.Repository;

import com.ElRistorante.LaCarta.Entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
