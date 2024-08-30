class Blinkit{
public static double takingTheOrdering(String groceriesName){
		if(groceriesName=="chips"){ return 600.00; }
		if(groceriesName=="vegetables") { return 740.00; }
		if(groceriesName=="toys") { return 300.00; }
		if(groceriesName=="rice") { return 50.00; }
		if(groceriesName=="stationery")  { return 80.00; }
		if(groceriesName == "meats") { return 670.00; }
		if(groceriesName== "kitchen Items") { return 40.00;}
		if(groceriesName=="dryFruits") { return 40.00; }
		if(groceriesName=="sauces") { return 495.00; }
		if(groceriesName=="teaPower") { return 390.00; }
		if(groceriesName=="sweet") { return 40.00; }
		if(groceriesName=="oil") { return 90.00; }
		if(groceriesName == "card") { return 585.00; }
		if(groceriesName=="skincareitem") { return 35.00; }
		if(groceriesName=="juis") { return 50.00; }
		else { System.out.println(groceriesName+ "is not found in the categories"); 
		}
		return 0.0;
	}
	public static double takingTheOrdering(String groceriesName,int quantity){
		double price=0.0;
		if(groceriesName=="meats"){
			price=670*quantity;
		}
		if(groceriesName=="chips"){
			price=600*quantity;
			
		}
		return price;
	}
}