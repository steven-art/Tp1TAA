package sample.aop.provider;

import org.springframework.stereotype.Component;

import sample.aop.product.Products;
import sample.aop.store.Store;


@Component
public class Provider implements IProvider{

	Store store = new Store();
	
	@Override
	public double getPrice(int p) {
		// TODO Auto-generated method stub
		return store.getPrice(p);
	}

	@Override
	public int order(Products p) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}