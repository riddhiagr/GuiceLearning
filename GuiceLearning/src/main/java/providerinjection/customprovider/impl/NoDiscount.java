package providerinjection.customprovider.impl;

import providerinjection.customprovider.IDiscountable;

public class NoDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 0;
	}

}
