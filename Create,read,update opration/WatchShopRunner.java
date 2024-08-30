class WatchShopRunner{
public static void main(String arg[]){
boolean value=WatchShop.addWatchBrandNames("TAG Heuer");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Blancpain");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Breitling");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Cartier");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Vacheron Constantin");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Frederique Constant");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Girard-Perregaux");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Glashütte Original");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Grand Seiko");
System.out.println(value);
value=WatchShop.addWatchBrandNames("Apple Watch SE");
System.out.println(value);
WatchShop.getAllWatchBrands();
boolean item=WatchShop.updateWatchBrands("Apple Watch SE","Samsung Galaxy Watch");
WatchShop.getAllWatchBrands();
WatchShop.deleteWatchBrand("Frederique Constant");
WatchShop.getAllWatchBrands();
}
}