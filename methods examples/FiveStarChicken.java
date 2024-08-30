 class FiveStarChicken{
	public static double takingTheOrdering(String foodName){
		if(foodName=="masala Fries"){ return 44.00; }
		if(foodName=="chicken Fingers") 
		{ return 40.00; }
		if(foodName=="chicken Nuggets") 
		{ return 100.00; }
		if(foodName=="Chicken Popcorn")
			{ return 50.00; }
		if(foodName=="masala Nimbu") 
			{ return 30.00; }
		if(foodName == "yammy Veg Roll") 
		{ return 54.00; }
		if(foodName== "egg curry") 
		{ return 80.00;}
		if(foodName=="hot Crispy") 
		{ return 90.00; }
		if(foodName=="hot Dog") 
		{ return 45.00; }
		if(foodName=="sausage") 
		{ return 39.00; }
		if(foodName=="matan Curry") 
		{ return 120.00; }
		if(foodName=="chicken Strips")
			{ return 150.00; }
		if(foodName == "veg Burger")
			{ return 60.00; }
		if(foodName=="chiken roll") 
		{ return 78.00; }
		if(foodName=="cutlet") 
		{ return 250.00; }
		else { System.out.println(foodName+ "is not found in the menu"); }
		return 0.0;
	}
}
