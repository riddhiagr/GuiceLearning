package providerinjection.providesannotation.impl;

import providerinjection.providesannotation.IDiscountable;

public class NoDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 0;
	}

}
