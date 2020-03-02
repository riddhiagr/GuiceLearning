package providerinjection.implicitprovider;

import javax.inject.Inject;

import com.google.inject.Provider;

public class Forever21 {

	private Provider<IDiscountable> discountable;

	@Inject
	public Forever21(Provider<IDiscountable> discountable) {
		this.discountable = discountable;
	}
	
	public double calculatePrice(double actualPrice) {
		double discount = discountable.get().getDiscounnt();
		double result =actualPrice - actualPrice*discount/100;
		System.out.println("Price after discount in forever21= "+ result);
		return result;
	}
}
