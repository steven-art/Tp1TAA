package sample.aop.store;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.aop.bank.IBank;
import sample.aop.client.Client;
import sample.aop.product.Products;
import sample.aop.provider.IProvider;

@Component
public class Store implements IFastLane, ILane, IJustHaveALook{

	IBank bank;
	
	Products banane = new Products("banane", 10, 1.5);
	List<Products> ListProduct = new ArrayList<>();
	@Autowired
	ILane ilane;

	public void init() {
		ListProduct.add(banane);
	}
	//Verifié le stock
	public void verifierStock() {


	}
	//fait le tranfert bancaire
	public void tranfertArgent(int price) {
		bank.transfert(price);
	}
	//met a jour le stock
	public void miseAJourStock() {

	}
	//augmenter le stock
	public void reaprovisionnement(int quantity) {
			if (quantity>0) {
				System.out.println("stock sufisant");
			}else {
				quantity = quantity + 15;
				System.out.println("le stock à été réaprovisionné");
			}
	}
	public Products getProduct() {
		return ListProduct.get(1) ;
	}
	public void setProduct(List<Products> product) {
		this.ListProduct = product;
	}
	@Override
	public int getQuantity(int quantity) {
		// TODO Auto-generated method stub
		if (quantity>0) {
			System.out.println("la quantité est de :"+ quantity);
			return quantity;
		}else {
			System.out.println("le produit n'est plus en stock");
			return quantity;
		}
	}
	@Override
	public int getCompte(int argentCompte) {
		// TODO Auto-generated method stub
		System.out.println("Somme sur le compte :"+argentCompte);
		return argentCompte;
	}
	@Override
	public void getTransfert() {
		// TODO Auto-generated method stub
		System.out.println("transfert d'argent effectué");
	}

	@Override
	public boolean isAvailable(int index) {
		if (ListProduct.get(index).getQuantity()>0) {
			System.out.println("le produit est disponible");
			return true;
		
		}
		else {
			System.out.println("le produit n'est pas disponible");
			return false;
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void oneShotOrder(Products product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addItemToCart(Products product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pay(int i) {
		// TODO Auto-generated method stub
		System.out.println("le client paye : "+i);
	}
	@Override
	public double getPrice(int p) {
		System.out.println("le prix est de :"+ ListProduct.get(p).getPrice());
		return ListProduct.get(p).getPrice();
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}