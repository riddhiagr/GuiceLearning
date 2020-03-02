package providerinjection.customprovider.factory;

import providerinjection.customprovider.IDiscountable;
import providerinjection.customprovider.ShoppingCart;

public interface IDiscountFactory {

	IDiscountable getApplicableDiscount(ShoppingCart cart);
}
