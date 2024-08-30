class TextilesRunner{
 public static void main(String arg[]){
	 boolean cloth=Textiles.addMaterial("Linen");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Chiffon");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Silk");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Cotton");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Denim");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Crepe");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Wool");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Corduroy");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Leather");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Polyester");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Brocade");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Elastane");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Calico");
	 System.out.println(cloth);
	 cloth=Textiles.addMaterial("Nylon");
	 System.out.println(cloth);
	 Textiles.getAllMaterial();
boolean	 value=Textiles.updateMaterial("Calico","Rayon");
	 	 Textiles.getAllMaterial();
		 Textiles.deleteMaterial("Calico");
		 Textiles.getAllMaterial();
 }
	 
 }