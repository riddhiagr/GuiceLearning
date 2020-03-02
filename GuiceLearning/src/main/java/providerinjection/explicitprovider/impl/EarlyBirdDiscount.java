package providerinjection.explicitprovider.impl;

import providerinjection.explicitprovider.IDiscountable;

public class EarlyBirdDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 10.5;
	}

}
