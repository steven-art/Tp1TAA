package sample.aop.store;

import sample.aop.product.Products;

public interface ILane {
	
	void reaprovisionnement(int quantity);

	void addItemToCart(Products product);

	void pay(int i);

}