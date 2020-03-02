package providerinjection.providedbyannotation.impl;

import providerinjection.providedbyannotation.IDiscountable;

public class EarlyBirdDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 10.5;
	}

}
