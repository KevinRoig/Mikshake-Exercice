package com.ElRistorante.LaCarta.Controller;

import com.ElRistorante.LaCarta.Entity.Recipe;
import com.ElRistorante.LaCarta.Repository.RecipeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController (RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @PostMapping("/recipe")
    @ResponseStatus(HttpStatus.CREATED)
    public Recipe create(@RequestBody Recipe newRecipe){
        return recipeRepository.save(newRecipe);
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes(){
        return recipeRepository.findAll();
    }

    @PutMapping("/recipe/{id}")
    public Recipe update(@PathVariable Long id, @RequestBody Recipe recipe) {
        recipe.setId(id);
        return recipeRepository.save(recipe);
    }

    @DeleteMapping("/recipe/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id){
        recipeRepository.deleteById(id);
    }

}
