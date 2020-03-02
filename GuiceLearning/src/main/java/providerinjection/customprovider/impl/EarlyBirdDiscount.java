package providerinjection.customprovider.impl;

import providerinjection.customprovider.IDiscountable;

public class EarlyBirdDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 10.5;
	}

}
