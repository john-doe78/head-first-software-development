package com.mercurymeals;

public class MealOptionNotFoundException extends Exception {
	private MealOption mealOption;
	
	public MealOptionNotFoundException(MealOption mealOption) {
		this.mealOption = mealOption;
	}
}
