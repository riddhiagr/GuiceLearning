package injector;

import java.time.LocalTime;


import methodinjection.IMessageService;
import methodinjection.impl.FacebookService;
import providerinjection.explicitprovider.IDiscountable;
import providerinjection.explicitprovider.factory.DiscountProvider;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(IMessageService.class).to(FacebookService.class);
		bind(IDiscountable.class).toProvider(DiscountProvider.class);
        MapBinder<DiscountOption, Discountable> mapBinder
        = MapBinder.newMapBinder(binder(), DiscountOption.class, Discountable.class);

	}

	@Provides
	public providerinjection.providesannotation.IDiscountable get() {
		int hour = LocalTime.now().getHour();
		if(isEarlyBird(hour))
			return new providerinjection.providesannotation.impl.EarlyBirdDiscount();
		if(isLateNigthHour(hour))
			return new providerinjection.providesannotation.impl.NightOwlDiscount();
		return new providerinjection.providesannotation.impl.NoDiscount();
	}

	private boolean isLateNigthHour(int hour) {
		return hour > 7 && hour <8;
	}

	private boolean isEarlyBird(int hour) {
		return hour > 5 && hour <7;
	}
}
