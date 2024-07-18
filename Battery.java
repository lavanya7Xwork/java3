class Battery{

   String name;
   String weight;
   public boolean charge(String name,String weight){
		 boolean isCreated=false;
		 if(name!=null &&weight!=null)
		 {
			 this.name=name;
			 this.weight=weight;
			 isCreated=true;
		 }
		 return isCreated;
		 }
		 public void displayBatteryInfo(){
			 System.out.println("the name of newspaper is:"+this.name);
			 System.out.println("language is :"+this.weight);
		 }
	 }
