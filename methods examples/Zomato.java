class Zomato{
public static double takeOrders(String foodName){
             
            if(foodName == "Pizza"){
			return 99.00;
			}
			if(foodName == "Burger"){
			return 89.00;
			}
			if(foodName == "Roti Curry"){
			return 120.00;
			}
			if(foodName == "Ice Cream"){
			return 89.00;
			}	
			if(foodName == "Pani Puri"){
			return 50.00;
			}
			if(foodName == "Samosa"){
			return 30.00;
			}
			if(foodName == "Masala Dosa"){
			return 80.00;
			}
			if(foodName == "Gobi Manchuri"){
			return 110.00;
			}
			if(foodName == "Sweet Pongal"){
			return 45.00;
			}
			if(foodName == "Halwa"){
			return 99.00;
			}
			if(foodName == "Paneer Roti"){
			return 129.00;
			}
			if(foodName == "Cold Drinks"){
			return 80.00;
			}
			if(foodName == "Pasta"){
			return 100.00;
			}
			if(foodName == "Vada Pav"){
			return 85.00;
			}
			if(foodName == "bel Puri"){
			return 30.00;
			}else{
				System.out.println(foodName +"Not Found");
			} 
            
			return 0.0;
		}
			public static double takeOrders(String foodName,int quantity){
				double price=0.0;
				if(foodName=="Bel Puri"){
					price=30.00*quantity;
				}
				return price;
			}
}
            
			
			
			
			
			
			
				
				