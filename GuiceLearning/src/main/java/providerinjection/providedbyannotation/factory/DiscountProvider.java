package providerinjection.providedbyannotation.factory;

import java.time.LocalTime;


import providerinjection.providedbyannotation.IDiscountable;
import providerinjection.providedbyannotation.impl.EarlyBirdDiscount;
import providerinjection.providedbyannotation.impl.NightOwlDiscount;
import providerinjection.providedbyannotation.impl.NoDiscount;

public class DiscountProvider implements javax.inject.Provider<IDiscountable> {

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
