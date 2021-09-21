package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;

import br.edu.ifpb.padroes.api.decorator.DiscountCupom;
import br.edu.ifpb.padroes.api.decorator.ExtraCheese;
import br.edu.ifpb.padroes.api.decorator.StuffedCrust;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        // TODO - implementar adapter para juntar as pizzas da PizzaHot e Damenos em um único conjunto
        for (PizzaHotPizza pizza : pizzaShopService.getPizzasPizzaHot()) {
            System.out.println(String.format("%s - %.2f", pizza.getTopping(), pizza.getPrice()));
        }
        for (DamenosPizza pizza : pizzaShopService.getPizzasDamenos()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getCost()));
        }

        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

        Pizza discountCupom = new DiscountCupom(pizza);
        Pizza extraCheese = new ExtraCheese(discountCupom);
        Pizza stuffedCrust = new StuffedCrust(extraCheese);

        // TODO - implementar padrão decorator para só precisar passar o objeto pizza
        pizzaShopService.orderPizza(stuffedCrust);
    }
}
