package br.edu.ifpb.padroes.api.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrust extends BaseDecorator{

	public StuffedCrust(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Float getPrice() {
		return super.getPrice() * 1.20f;
	}

	@Override
	public String getName() {
		return super.getName() + " (stuffed crust)";
	}
}