 class Dominos{
	public static double takingTheOrdering(String foodName){
		if(foodName=="corn"){ return 159.00; }
		if(foodName=="chiken Pepperoni") 
		{ return 70.00; 
	          }
		if(foodName== "cheesy Dip") { return 80.00; }
		if(foodName== "harissa Dip") { return 500.00; }
		if(foodName== "single Taco")  { return 79.00; }
		if(foodName== "Double Taco") { return 130.00; }
		if(foodName== "choco Cake") { return 40.00;}
		if(foodName=="red Cake") { return 440.00; }
		if(foodName=="pepsi") { return 45.00; }
		if(foodName=="desserts") { return 30.00; }
		if(foodName=="cheesy pizza") { return 250.00; }
		if(foodName=="fresh veggie") { return 150.00; }
		if(foodName == "tikka ") { return 55.00; }
		if(foodName=="blazing") { return 305.00; }
		if(foodName=="peppy paneer") { return 350.00; }
		else { System.out.println(foodName+ "is not found in the menu"); }
		return 0.0;
	}
}
