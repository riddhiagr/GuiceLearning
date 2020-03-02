package providerinjection.providesannotation.impl;

import providerinjection.providesannotation.IDiscountable;

public class NightOwlDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 5.5;
	}

}
