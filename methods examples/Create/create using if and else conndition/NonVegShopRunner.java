class NonVegShopRunner{
public static void main(String[] shop){
boolean veg=NonVegShop.createNonVegName("Chikan Biriyani");
System.out.println(veg);
boolean priceAdded=NonVegShop.addNonVegPrice(100.0);
System.out.println("the chikan biriyani price is:");
boolean test=NonVegShop.updateNonVegDetails("egg curry","kal sup");
System.out.println(test);
//className.getmenthod
 NonVegShop .getNonVegDetails();
 NonVegShop.updateNonVegDetails();
 }
 }