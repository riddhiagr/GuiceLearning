package providerinjection.customprovider.factory;

import java.util.Map;

import javax.inject.Inject;

import providerinjection.customprovider.IDiscountable;
import providerinjection.customprovider.ShoppingCart;

public class DiscountFactory  implements IDiscountFactory{

	private Map<Integer, IDiscountable> mapBinder;

	@Inject
	public DiscountFactory(Map<Integer, IDiscountable> mapBinder) {
		this.mapBinder = mapBinder;
	}
	
	@Override
	public IDiscountable getApplicableDiscount(ShoppingCart cart) {
		if(isEarlyBird(cart.getTimeHour()))
			return mapBinder.get(0);
		
		if(isLateNigthHour(cart.getTimeHour()))
			return mapBinder.get(1);
		
		return mapBinder.get(2);
	}

	private boolean isLateNigthHour(int hour) {
		return hour > 7 && hour <8;
	}

	private boolean isEarlyBird(int hour) {
		return hour > 5 && hour <7;
	}

}
