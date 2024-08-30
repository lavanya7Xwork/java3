class NonVegShop{
  static String shopName="My Shop";
  static String shopOwnerName="Lavanya";
  static String NonVegShopName[]={null,null,null,null,null,null};
  static double NonVegPrice[]={0.0,0.0,0.0,0.0,0.0,0.0};
  static int NonVegShopindex;
  public static boolean createNonVegName(String foodName){
  System.out.println("createNonVegName started");
   boolean isNonVegCreated=false;
   //validation
   
   if(foodName!=null){
	   //variable string[]
   NonVegShopName[NonVegShopindex]=foodName;
   NonVegShopindex++;
   isNonVegCreated=true;
   }
   else{
   System.out.println("please enter the valid item");
   }
   System.out.println("createNonVegName ended");
  return isNonVegCreated;
  }  
  public static boolean addNonVegPrice(double NonVegPrices){
	  boolean isPriceAdded=false;
	  if(NonVegPrices>0.0){
		  NonVegPrice[NonVegPriceindex]=NonVegPrices;
		  NonVegPriceindex++;
		  isPriceAdded=true;
	  }
	  else{
		  System.out.println("price not match");
	  }
	  return isPriceAdded;
  }
public static void getNonVegDetails(){
  System.out.println("getNonVegDetails started");
  String foodName="Chikan Biriyani";
  double price=100.00;
  String foodName="matan Biriyani";
  double price=190.00;
  String foodName="veg Biriyani";
  double price=50.00;
  String foodName="Chikan dam Biriyani";
  double price=300.00;
  String foodName="Chikan curry";
  double price=200.00;
  String foodName="egg curry";
  double price=150.00;
  String foodName="matan curry";
  double price=250.00;
  System.out.println(foodName); 
  System.out.println(price);
  
  System.out.println("getNonVegDetails ended");
  return;
    }
	
	public static boolean updateNonVegDetails(String oldNonVegName,String newNonVegName){
		
	System.out.println("updateNonVegDetails Started");
	boolean isupdate==false;
	for(int NonVegShopindex=0;NonVegShopindex<foodName.length;NonVegShopindex++){
	if(oldNonVegName==foodName[NonVegShopindex]){
         foodName[NonVegShopindex]=newNonVegName;	
         isupdate==true;		 
	}
	}
	if(isupdate==false){
	System.out.println("oldName"+not found);
}
return isupdate;					
	}
	
  }