package providerinjection.providesannotation;

import com.google.inject.ImplementedBy;

import providerinjection.implicitprovider.impl.EarlyBirdDiscount;

@ImplementedBy(value = EarlyBirdDiscount.class) 
public interface IDiscountable {

	double getDiscounnt();
}
