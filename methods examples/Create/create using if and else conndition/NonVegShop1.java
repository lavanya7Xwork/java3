class NonVegShop1{
  static String shopName="My Shop";
  static String shopOwnerName="Lavanya";
  static String NonVegShopName[]={null,null,null,null,null,null};
  static int NonVegShopindex;
  public static boolean createNonVegName(String foodName){
  System.out.println("createNonVegName started");
   boolean isNonVegCreated=false;
   //validation
   if(NonVegShopindex<foodName.length){
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
 }  
public static void getNonVegDetails(){
  System.out.println("getNonVegDetails started");
  String foodName="Chikan Biriyani";
  String foodName="matan Biriyani";
  String foodName="veg Biriyani";
  String foodName="Chikan dam Biriyani";
  String foodName="Chikan curry";
  String foodName="egg curry";
  String foodName="matan curry";
  System.out.println(foodName); 
  System.out.println(price);
  System.out.println("getNonVegDetails ended");
  return;
    }	
	public static boolean updateNonVegDetails(String oldNonVegName,String newNonVegName){
		
	System.out.println("updateNonVegDetails Started");
	boolean isupdate=false;
	for(int NonVegShopindex=0;NonVegShopindex<foodName.length;NonVegShopindex++){
	if(oldNonVegName==foodName[NonVegShopindex]){
         foodName[NonVegShopindex]=newNonVegName;	
         isupdate=true;		 
	}
	}
	if(isupdate==false){
	System.out.println("oldName"+not found);
}
return isupdate;					
	}
	
  }