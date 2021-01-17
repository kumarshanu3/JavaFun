package com.purchase;

import java.util.Calendar;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class PurchaseEvent {

	private double price;
	private String itemName;
	private Date purchaseDate;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	@Override
	public String toString() {
		return "PurchaseEvent [price=" + price + ", itemName=" + itemName + ", purchaseDate=" + purchaseDate + "]";
	}
	
	
	public static void main (String[] args) {
		PurchaseEvent pe = new PurchaseEvent();
		pe.itemName = "bottle";
		pe.price = 85.00;
		pe.purchaseDate = Calendar.getInstance().getTime();
		
		System.out.println("Purchase details : " + pe);
		
		Gson gson = new GsonBuilder().create();
		
		System.out.println("Purchase details in json format : " + gson.toJson(pe));
	}
	
}
