package providerinjection.customprovider;

import javax.inject.Inject;

public class Mango {

	private IDiscountable discountable;

	@Inject
	public Mango(IDiscountable discountable) {
		this.discountable = discountable;
	}
	
	public double calculatePrice(double actualPrice) {
		double discount = discountable.getDiscounnt();
		double result =actualPrice - actualPrice*discount/100;
		System.out.println("Price after discount in Mango= "+ result);
		return result;
	}
}
