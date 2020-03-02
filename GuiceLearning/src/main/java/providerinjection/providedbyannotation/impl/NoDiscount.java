package providerinjection.providedbyannotation.impl;

import providerinjection.providedbyannotation.IDiscountable;

public class NoDiscount implements IDiscountable {

	@Override
	public double getDiscounnt() {
		return 0;
	}

}
