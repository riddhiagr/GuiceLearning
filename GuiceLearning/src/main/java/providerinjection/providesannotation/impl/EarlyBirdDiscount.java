package providerinjection.providesannotation.impl;

import providerinjection.providesannotation.IDiscountable;

public class EarlyBirdDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 10.5;
	}

}
