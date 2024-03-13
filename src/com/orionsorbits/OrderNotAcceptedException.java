package com.orionsorbits;

import com.mercurymeals.*;

public class OrderNotAcceptedException extends Exception {
	private Order order;
	
	public OrderNotAcceptedException(Order order) {
		this.order = order;
	}
}
