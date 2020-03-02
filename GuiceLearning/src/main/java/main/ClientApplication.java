package main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import injector.AppInjector;
import methodinjection.MyApplication;
import providerinjection.explicitprovider.ZARA;
import providerinjection.implicitprovider.Forever21;
import providerinjection.providedbyannotation.Only;
import providerinjection.providesannotation.Mango;

public class ClientApplication {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		MyApplication app = injector.getInstance(MyApplication.class);
		app.sendMessage("Hi Riddhi");
		Forever21 forever21 = injector.getInstance(Forever21.class);
		forever21.calculatePrice(100);
		ZARA zara = injector.getInstance(ZARA.class);
		zara.calculatePrice(100);
		Mango mango = injector.getInstance(Mango.class);
		mango.calculatePrice(100);
		Only only = injector.getInstance(Only.class);
		only.calculatePrice(100);
	}
}
