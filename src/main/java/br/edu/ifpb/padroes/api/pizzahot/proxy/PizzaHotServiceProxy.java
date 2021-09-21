package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.List;
import java.util.ArrayList;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
    PizzaHotService pizzaHotService;
	List<PizzaHotPizza> cache = new ArrayList<>();
	public PizzaHotServiceProxy() {
		this.pizzaHotService = new PizzaHotServiceImpl();
	}
    @Override
    public List<PizzaHotPizza> getPizzas() {
        // TODO - implementar proxy
        if (cache.isEmpty()) {
    		cache = pizzaHotService.getPizzas();
    	}
        else {
    		System.out.println("listagem recuperada");
    	}
        return cache;
    }
}
