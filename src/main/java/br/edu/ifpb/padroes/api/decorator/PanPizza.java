package br.edu.ifpb.padroes.api.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizza extends BaseDecorator{

	public PanPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Float getPrice() {
		return super.getPrice() * 1.15f;
	}

	@Override
	public String getName() {
		return super.getName() + " (pan pizza)";
	}

}