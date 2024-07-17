package com.service;

public class Fedex implements IDeliveryService{

	@Override
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product delivered by Fedex");
		return true;
	}

}
