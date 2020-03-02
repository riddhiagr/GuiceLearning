package providerinjection.explicitprovider.impl;

import providerinjection.explicitprovider.IDiscountable;

public class NoDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 0;
	}

}
