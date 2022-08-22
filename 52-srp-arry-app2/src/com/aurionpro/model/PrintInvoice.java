package com.aurionpro.model;

public class PrintInvoice {
	public void printInvoice(Product inv) {
		System.out.println("id :" + inv.getId());
		System.out.println("Discription : " + inv.getDescription());
		System.out.println("TAX: " + inv.calculateTax());
		System.out.println("Discount : " + inv.calculateDiscount());
		System.out.println("Total : " + inv.calculateTotal());
		
	}


}
