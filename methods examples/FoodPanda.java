class FoodPanda{
	public static double gettingDetails (String foodName)
	{
		if(foodName=="pulao")
			{ return 70.00; 
		}
		if(foodName=="veg biriyani") { 
		return 120.00; 
		}
		if(foodName =="ghee rice") { return 90.00; }
		if(foodName=="jeera rice") { return 85.0; }
		if(foodName=="kushka") { return 100.00; }
		if(foodName=="biranji") { return 110.00; }
		if(foodName=="vanjibath") { return 65.00; }
		if(foodName=="curd rice") { return 60.00; }
		if(foodName=="masala rice") { return 65.00; }
		if(foodName=="gobi rice") { return 70.00; }
		if(foodName=="lemon rice")  { return 40.00; }
		if(foodName=="puliyogare") { return 45.00; }
		if(foodName=="mango rice") { return 60.00; }
		if(foodName=="tomato bath") { return 60.00; }
		if(foodName=="ricebath")
		{
			return 80.00;}
			else{
			System.out.println(foodName +"Not Found");
		}
		return 0.0;
	}
	public static double gettingDetails(String foodName,int quantity){
		double price=0.0;
		if(foodName=="pulao"){
			price=70.00*quantity;
		}
		return price;
	}
}		