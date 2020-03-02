package providerinjection.explicitprovider.factory;

import java.time.LocalTime;

import providerinjection.explicitprovider.IDiscountable;
import providerinjection.explicitprovider.impl.EarlyBirdDiscount;
import providerinjection.explicitprovider.impl.NightOwlDiscount;
import providerinjection.explicitprovider.impl.NoDiscount;

public class DiscountProvider implements Provider<IDiscountable> {

	@Override
	public IDiscountable get() {
		int hour = LocalTime.now().getHour();
		if(isEarlyBird(hour))
			return new EarlyBirdDiscount();
		if(isLateNigthHour(hour))
			return new NightOwlDiscount();
		return new NoDiscount();
	}

	private boolean isLateNigthHour(int hour) {
		return hour > 7 && hour <8;
	}

	private boolean isEarlyBird(int hour) {
		return hour > 5 && hour <7;
	}

}
