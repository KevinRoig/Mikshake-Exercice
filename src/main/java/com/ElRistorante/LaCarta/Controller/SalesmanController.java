package com.ElRistorante.LaCarta.Controller;

import com.ElRistorante.LaCarta.Entity.Recipe;
import com.ElRistorante.LaCarta.Entity.Salesman;
import com.ElRistorante.LaCarta.Repository.RecipeRepository;
import com.ElRistorante.LaCarta.Repository.SalesmanRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class SalesmanController {

    private final SalesmanRepository salesmanRepository;

    public SalesmanController(SalesmanRepository salesmanRepository){
        this.salesmanRepository = salesmanRepository;
    }

    @PostMapping("/salesman")
    @ResponseStatus(HttpStatus.CREATED)
    public Salesman create(@RequestBody Salesman newSalesman){
        return salesmanRepository.save(newSalesman);
    }

    @GetMapping("/salesmen")
    public List<Salesman> getSalesmen(){
        return salesmanRepository.findAll();
    }

    @PutMapping("/salesman/{id}")
    public Salesman update(@PathVariable Long id, @RequestBody Salesman salesman) {
        salesman.setId(id);
        return salesmanRepository.save(salesman);
    }

    @DeleteMapping("/salesman/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id){
        salesmanRepository.deleteById(id);
    }

}
