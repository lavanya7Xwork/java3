class SunGlasses{

	 String name;
	 String  type;
	 double price;
	 public boolean createSunGlass(String name,String type,double price){
		 boolean isSunGlassCreated=false;
		 if(name!=null && type!=null&&price>0.0)
		 {
			 this.name=name;
			 this.type=type;
			 this.price=price;
			 isSunGlassCreated=true;
		 }
		 return isSunGlassCreated;
		 }
		 public void displaySunGlassInfo(){
			 System.out.println("the name of sunglass is:"+this.name);
			 System.out.println("type of glass:"+this.type);
			 System.out.println("price is :"+this.price);
		 }
	 }