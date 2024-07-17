package com.Main;

import com.service.BlueDart;
import com.service.Fedex;

public class Launch {

	public static void main(String[] args) {
		Amazon amazon = new Amazon();
		amazon.setService(new BlueDart());
	//	amazon.setService(new Fedex());
		
		Boolean status = amazon.deliverTheProduct(525.25);
		
		if (status)
			System.out.println("Successfully Delivered");
		else
			System.out.println("Not delivered");

	}

}
