package providerinjection.implicitprovider.impl;

import providerinjection.implicitprovider.IDiscountable;

public class EarlyBirdDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 10.5;
	}

}
