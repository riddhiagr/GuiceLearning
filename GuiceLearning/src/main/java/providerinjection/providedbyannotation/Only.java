package providerinjection.providedbyannotation;

import javax.inject.Inject;

public class Only {

	private IDiscountable discountable;

	@Inject
	public Only(IDiscountable discountable) {
		this.discountable = discountable;
	}
	
	public double calculatePrice(double actualPrice) {
		double discount = discountable.getDiscounnt();
		double result =actualPrice - actualPrice*discount/100;
		System.out.println("Price after discount in Only= "+ result);
		return result;
	}
}
