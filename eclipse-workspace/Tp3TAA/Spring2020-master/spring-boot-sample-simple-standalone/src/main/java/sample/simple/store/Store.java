package sample.simple.store;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.simple.bank.IBank;
import sample.simple.client.Client;

import sample.simple.provider.IProvider;

@Component
public class Store  implements IFastLane, ILane, IJustHaveALook{
	@Autowired
	IBank bank;
	
	
	
	List<String> ListProduct = new ArrayList<>();
	@Autowired(required=true)
	ILane ilane;

	public void init() {
		ListProduct.add("banane");
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
	public String getProduct(String name) {
		String res = "";
		for (String  string : ListProduct) {
		        if (string == name) {
		           res = "le produit est présent";
		        	return res;
		        }
		    }
		 
		 return res;
		
	}
	public void setProduct(List<String> string) {
		this.ListProduct = string;
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
//ListProduct.get(index).getQuantity()>0 && 
	@Override
	public boolean isAvailable(int index) {
		
		if (!ListProduct.isEmpty()) {
			System.out.println("le produit est disponible");
			return true;
		
		}
		else {
			System.out.println("le produit n'est pas disponible");
			return false;
		}
		
		
	}
	@Override
	public void oneShotOrder(String string, int quantity) {
		// TODO Auto-generated method stub
		System.out.println("Le produit "+ string +"est commandé avec une quantité de " + quantity);
	}
	@Override
	public void addItemToCart(String string) {
		// TODO Auto-generated method stub
		System.out.println("le produit "+string+"a été ajouté");
	}
	@Override
	public void pay(int i) {
		// TODO Auto-generated method stub
		System.out.println("le client paye : "+i);
	}
//	@Override
//	public double getPrice(int p) {
//		if (ListProduct.isEmpty()) {
//			double zero= 0.0;
//			return zero;
//		}
//		System.out.println("le prix est de :"+ ListProduct.get(p).getPrice());
//		return ListProduct.get(p).getPrice();
//		
//		
//	}
	@Override
	public double getPrice(int p) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
