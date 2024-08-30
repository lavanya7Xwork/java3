class NonVegShop1{
  static String shopName="My Shop";
  static String shopOwnerName="Lavanya";
  static String NonVegShopName[]={null,null};
  static int NonVegShopindex;
  
  public static boolean createNonVegName(String foodName){
  System.out.println("createNonVegName started");
   boolean isNonVegCreated=false;
   //validation
   if(NonVegShopindex<NonVegShopName.length){
   if(foodName!=null){
	   //variable string[]=parameter
   NonVegShopName[NonVegShopindex]=foodName;
   NonVegShopindex++;
   isNonVegCreated=true;
    }else System.out.println("items are full..... connot to br declared");
   }else{
	   System.out.println("amelnodana");
   System.out.println("createNonVegName ended");
   }
  return isNonVegCreated;
 }  

public static void getNonVegDetails(){
  System.out.println("getNonVegDetails started");
  //String foodName="Chikan Biriyani";
  //String foodName1="matan Biriyani";
  //in the above we can do and for loop can be used in array type
      //type,methodPrameter:array variable
  for(String foodName:NonVegShopName)
  {
  System.out.println(foodName); 
  }
  System.out.println("getNonVegDetails ended");
  return;
    }
	
	public static boolean updateNonVegDetails(String oldNonVegName,String newNonVegName){		
	System.out.println("updateNonVegDetails Started");
	boolean isupdate=false;
	for(int NonVegShopindex=0;NonVegShopindex<NonVegShopName.length;NonVegShopindex++){
	if(oldNonVegName==NonVegShopName[NonVegShopindex]){
         NonVegShopName[NonVegShopindex]=newNonVegName;	
         isupdate=true;		 
	 }
	}
	if(isupdate==false){
	System.out.println("oldName not found");
	}
	System.out.println("updateNonVegDetails ended");
return isupdate;					
	}
}