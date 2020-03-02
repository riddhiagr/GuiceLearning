package providerinjection.providedbyannotation.impl;

import providerinjection.providedbyannotation.IDiscountable;

public class NightOwlDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 5.5;
	}

}
