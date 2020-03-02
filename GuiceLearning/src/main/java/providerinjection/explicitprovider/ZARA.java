package providerinjection.explicitprovider;

import javax.inject.Inject;

public class ZARA {
	private IDiscountable discountable;

	@Inject
	public ZARA(IDiscountable discountable) {
		this.discountable = discountable;
	}
	
	public double calculatePrice(double actualPrice) {
		double discount = discountable.getDiscounnt();
		double result =actualPrice - actualPrice*discount/100;
		System.out.println("Price after discount in ZARA = "+ result);
		return result;
	}
}
