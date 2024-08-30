 class Swiggy{
	public static double takingTheOrdering(String foodName){
		double price=0.0;
		if(foodName=="paav Bhaji")
		{
			price=60.00;
		}
			
       if(foodName=="jeera Rice")
       {
	    price=40.00;
       }	
           return 40.00; 
	}
	        //method overloading in giveing a one or more  parameters
	public static double takingTheOrdering(String foodName,int quantity){ 
    double price=0.0;	
     if(foodName=="paav Bhaji"){
	 price =60.00*quantity;
	 } 
	 if(foodName=="jeera Rice"){
		 price=40.00*quantity;
	 }
	 return price;       
  }
 }
  