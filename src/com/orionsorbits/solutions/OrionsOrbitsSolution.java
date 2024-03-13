package com.orionsorbits.solutions;

import com.mercurymeals.*;
import com.orionsorbits.OrderNotAcceptedException;

public class OrionsOrbitsSolution {

	public static void main(String[] args) throws Exception
	{
		OrionsOrbitsSolution oo = new OrionsOrbitsSolution();
		System.out.println("Adding order...");
		oo.orderMeal(new String[]{"Fish and Chips"}, "VS01");
	}
	
	public void orderMeal(String[] options, String flightNo) throws Exception {
		
		MercuryMeals mercuryMeals = MercuryMeals.getInstance();
		Order order = mercuryMeals.createOrder();
		
		for (int x = 0; x < options.length; x++) {
			MealOption mealOption = mercuryMeals.getMealOption(options[x]);
			
			if (mealOption != null) {
				order.addMealOption(mealOption);
			} else {
				throw new MealOptionNotFoundException(mealOption);
			}
		}
		
		order.addKeyword(flightNo);
		
		if (!mercuryMeals.submitOrder(order)) {
			throw new OrderNotAcceptedException(order);
		}
	}
}
