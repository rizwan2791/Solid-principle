package com.aurionpro.test;
import com.aurionpro.model.*;
public class InvoiceTest {
	public static void main(String[] args) {
		Product inv=new Product("101","Developer", 100, 10, 5);
//		PrintInvoice in=new PrintInvoice();
		inv.printInvoice();
		
	}	

}
