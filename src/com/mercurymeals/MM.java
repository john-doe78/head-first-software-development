package com.mercurymeals;

public class MM {
    public static MM establish() {
		return new MM();
	}
    
    public boolean isAnyOptionsForKey(String option)
    {
    	return true;
    }
    
    public MealOption[] getMealOption(String option)
    {
    	return new MealOption[]{new MealOption(option)};
    }
    
    public void su(Order order) throws Exception
    {
    	throw new Exception("order not found");
    }
    
    public Order[] find(String qk, String extraOptions)
    {
    	return new Order[]{new Order()};
    }
}
