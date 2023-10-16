package com.ElRistorante.LaCarta;

import com.ElRistorante.LaCarta.Entity.Recipe;
import com.ElRistorante.LaCarta.Entity.Salesman;
import com.ElRistorante.LaCarta.Repository.RecipeRepository;
import com.ElRistorante.LaCarta.Repository.SalesmanRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LaCartaApplication {

	private final RecipeRepository recipeRepository;
	private final SalesmanRepository salesmanRepository;

	public LaCartaApplication(RecipeRepository recipeRepository, SalesmanRepository salesmanRepository){
		this.recipeRepository = recipeRepository;
		this.salesmanRepository = salesmanRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(LaCartaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (String[] args) -> {
			Recipe recipe = new Recipe(4, "'R' is for Red", "Strawberry" );
			Recipe recipe1 = new Recipe(10, "Weird face", "Lemon");
			Recipe recipe2 = new Recipe(2, "Smooth as a baby's butt", "Peach");
			Recipe recipe3 = new Recipe(100, "Booze lovers", "Rhum");
			recipeRepository.save(recipe);
			recipeRepository.save(recipe1);
			recipeRepository.save(recipe2);
			recipeRepository.save(recipe3);

			Salesman salesman = new Salesman("Roberto", 22);
			Salesman salesman1 = new Salesman("José", 21);
			salesmanRepository.save(salesman);
			salesmanRepository.save(salesman1);
		};
	}
}
