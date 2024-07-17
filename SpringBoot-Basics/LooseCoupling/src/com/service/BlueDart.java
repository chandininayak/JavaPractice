package com.service;

public class BlueDart implements IDeliveryService{

	@Override
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product delivered by BlueDart");
		return true;
	}

}
