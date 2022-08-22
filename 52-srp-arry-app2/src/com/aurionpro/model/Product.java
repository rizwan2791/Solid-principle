package com.aurionpro.model;

public class Product {
	String id;
	String description;
	double amount;
	float tax;
	double discountPercentage;

	public Product(String id, String description, double amount, float tax, double discountPercentage) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercentage = discountPercentage;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public double calculateTax() {
		return amount * tax / 100;

	}

	public double calculateDiscount() {
		return amount * discountPercentage / 100;

	}

	public double calculateTotal() {
		return amount - calculateTax() + calculateDiscount();

	}

	public void printInvoice() {
		PrintInvoice obj = new PrintInvoice();
		obj.printInvoice(this);
	}

}
