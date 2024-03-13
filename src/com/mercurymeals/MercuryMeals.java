package com.mercurymeals;

//Follows the Singleton design pattern
public class MercuryMeals 
{ 
	   public MercuryMeals meallythang; 
	   private Order cO; 
	   private String qk = "select * from order-table where keywords like %1;"; 
	   private static MercuryMeals instance; 
	   
	   public MercuryMeals() { 
	} 
	public static MercuryMeals getInstance() 
	{ 
	   instance = new MercuryMeals(); 
	   return instance; 
	} 
	   // TODO Really should document this at some point... TBD 
	   public Order createOrder() { 
	      return new Order();} 
	public MealOption getMealOption(String option) 
	throws MercuryMealsConnectionException { 
	   if (MM.establish().isAnyOptionsForKey(option)) 
	   { return MM.establish().getMealOption(option)[0]; }; 
	   return null; 
	} 

	   public boolean submitOrder(Order cO) 
	   { 
	      try { 
	        MM mm = MM.establish(); 
	        mm.su(this.cO); }
	      catch (Exception e) 
	      { // write out an error message 
	    	  } return false; } 
	      
	      public Order[] getOrdersThatMatchKeyword(String qk) 
	                                      throws MercuryMealsConnectionException { 
	        Order[] o; 
	        try { 
	            o = MM.establish().find(qk, qk); 
	         } catch (Exception e) { 
	            return null; 
	         } 
	         return o; 
	      }}