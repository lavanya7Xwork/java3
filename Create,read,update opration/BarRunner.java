class BarRunner{
public static void main(String arg[]){
boolean value=Bar.addWineBrands("Fruit juice");
System.out.println(value);
value=Bar.addWineBrands("Coffee drink");
System.out.println(value);
value=Bar.addWineBrands("Soft drinks");
System.out.println(value);
value=Bar.addWineBrands("Beer");
System.out.println(value);
value=Bar.addWineBrands("Wine");
System.out.println(value);
value=Bar.addWineBrands("Milk drink");
System.out.println(value);
value=Bar.addWineBrands("Red Bull");
System.out.println(value);
value=Bar.addWineBrands("Energy drinks");
System.out.println(value);
	value=Bar.addWineBrands("Whiskey Sour");
System.out.println(value);
value=Bar.addWineBrands("Old Fashioned");
System.out.println(value);
value=Bar.addWineBrands("Vodka");
System.out.println(value);
value=Bar.addWineBrands(" rum");
System.out.println(value);
value=Bar.addWineBrands("brandy");
System.out.println(value);
value=Bar.addWineBrands(" soju");
System.out.println(value);
value=Bar.addWineBrands("singani");
System.out.println(value);
   Bar.getAllBrands();
boolean items=Bar.updateWineBrand("Energy drinks","Mimosa");
   Bar.getAllBrands();
   Bar.deleteWineBrand("singani");
   Bar.getAllBrands();
}
}