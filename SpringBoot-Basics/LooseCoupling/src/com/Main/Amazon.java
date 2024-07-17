package com.Main;
import com.service.IDeliveryService;

public class Amazon {
	private IDeliveryService service;

	public void setService(IDeliveryService service) {
		this.service = service;
	}
	
	public Boolean deliverTheProduct(Double amount)
	{
		return service.deliveryProduct(amount);
	}
	

}
