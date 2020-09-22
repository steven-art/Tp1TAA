package sample.aop.product;

import org.springframework.stereotype.Component;

@Component
public class Products {

	private int Quantity;
	private String name;
	private double price;
	

	public Products(String name, int Quantity, double price) {
		this.name = name;
		this.Quantity = Quantity;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}