package com.mercurymeals;

import java.util.*;

public class Order {
	private String keyword;
	private List mealOptions = new ArrayList();
	
	public void addKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public void addMealOption(MealOption mealOption) {
		this.mealOptions.add(mealOption);
	}
}
