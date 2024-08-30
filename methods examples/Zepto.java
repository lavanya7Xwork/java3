class Zepto{
public static double takingTheOrdering(String groceriesName){
		if(groceriesName=="fruits")
		{ return 60.00; }
		if(groceriesName=="vegetables")
			{ return 70.00; }
		if(groceriesName=="bread") 
		{ return 100.00; }
		if(groceriesName=="rice") 
		{ return 50.00; }
		if(groceriesName=="masala")  
		{ return 80.00; }
		if(groceriesName == "meats") 
		{ return 60.00; }
		if(groceriesName== "egg") 
		{ return 40.00;}
		if(groceriesName=="dryFruits")
			{ return 40.00; }
		if(groceriesName=="sauces") 
		{ return 45.00; }
		if(groceriesName=="teaPower") 
		{ return 30.00; }
		if(groceriesName=="sweet") 
		{ return 40.00; }
		if(groceriesName=="oil") 
		{ return 50.00; }
		if(groceriesName == "paanCorner")
			{ return 55.00; }
		if(groceriesName=="skincareitem")
			{ return 35.00; }
		if(groceriesName=="makeupitem") 
		{ return 50.00; }
		else { System.out.println(groceriesName+ "is not found in the categories"); }
		return 0.0;
	}
	public static double takingTheOrdering(String groceriesName,int quantity){
		double price=0.0;
		if(groceriesName=="oil"){
			price=50.00*quantity;
	}
	if(groceriesName=="makeupitem"){
	price=50.00*quantity;
}
return price;
	}
}