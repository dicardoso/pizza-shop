package br.edu.ifpb.padroes.api.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheese extends BaseDecorator{

	public ExtraCheese(Pizza pizza) {
		super(pizza);
	}
  
	@Override
	public Float getPrice() {
		return super.getPrice() * 1.10f;
	}

	@Override
	public String getName() {
		return super.getName() + " (extra cheese)";
	}

}