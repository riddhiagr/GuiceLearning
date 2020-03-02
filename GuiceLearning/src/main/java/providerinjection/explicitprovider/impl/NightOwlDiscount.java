package providerinjection.explicitprovider.impl;

import providerinjection.explicitprovider.IDiscountable;

public class NightOwlDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 5.5;
	}

}
