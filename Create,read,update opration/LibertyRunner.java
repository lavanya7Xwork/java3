class LibertyRunner{
public static void main(String args[]){
	boolean items=Liberty.addShoeBrands("Sandal");
	System.out.println(items);
	items=Liberty.addShoeBrands("Boat shoes");
	System.out.println(items);
	items=Liberty.addShoeBrands("Adidas");
	System.out.println(items);
	items=Liberty.addShoeBrands("Ankle boots");
	System.out.println(items);
	items=Liberty.addShoeBrands("Ballet flats");
	System.out.println(items);
	items=Liberty.addShoeBrands("Converse");
	System.out.println(items);
	items=Liberty.addShoeBrands("Nike");
	System.out.println(items);
	items=Liberty.addShoeBrands("Loafer");
	System.out.println(items);
	items=Liberty.addShoeBrands("Reebok");
	System.out.println(items);
	items=Liberty.addShoeBrands("Bata");
	System.out.println(items);
	items=Liberty.addShoeBrands("vans");
	System.out.println(items);
	items=Liberty.addShoeBrands("Skechers");
	System.out.println(items);
	items=Liberty.addShoeBrands("puma");
	System.out.println(items);
	items=Liberty.addShoeBrands("Oxford");
	System.out.println(items);
	items=Liberty.addShoeBrands("BILLY Footwear");
	System.out.println(items);
	items=Liberty.addShoeBrands("Moccasins");
	System.out.println(items);
	Liberty.getAllShoeBrands();
boolean value=Liberty.updateShoeBrand("Moccasins","Peep toe shoes");
   Liberty.getAllShoeBrands();
   Liberty.deleteShoeBrand("vans");
   Liberty.getAllShoeBrands();
}
	
}