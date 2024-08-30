class Dmart{
	
static String chocolates[]={"Dairy Milk","Munch","KitKat","Temptation","Milky Bar","Gone Mad","5Star"};
	public static void main(String dmart[]){
	System.out.println("The available chocolates are: "+chocolates.length);
	for(int index=0;index<=chocolates.length-1;index++){
		System.out.println(chocolates[index]);	
		
	//for each Loop
	for(String chocolate:chocolates){
		System.out.println(chocolate);
	}
	}
	}
	}