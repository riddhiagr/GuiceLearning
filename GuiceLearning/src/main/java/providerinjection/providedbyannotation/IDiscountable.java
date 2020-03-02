package providerinjection.providedbyannotation;

import com.google.inject.ProvidedBy;

import providerinjection.providedbyannotation.factory.DiscountProvider;

@ProvidedBy(value = DiscountProvider.class)
public interface IDiscountable {

	double getDiscounnt();
}
