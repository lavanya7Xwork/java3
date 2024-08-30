class NonVegShopRunner1{
public static void main(String shop[]){
boolean veg=NonVegShop1.createNonVegName("Chikan Biriyani");
System.out.println(veg);
veg=NonVegShop1.createNonVegName("egg Cury");
System.out.println(veg);
//className.getmenthod
NonVegShop1.getNonVegDetails();
boolean test=NonVegShop1.updateNonVegDetails("egg Cury","kal sup");
NonVegShop1.getNonVegDetails();
  }
 }