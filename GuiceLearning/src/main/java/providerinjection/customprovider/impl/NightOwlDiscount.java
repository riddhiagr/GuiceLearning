package providerinjection.customprovider.impl;

import providerinjection.customprovider.IDiscountable;

public class NightOwlDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 5.5;
	}

}
