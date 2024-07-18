 class SimCard{
 String name;
 String plan;
 public void communication(String name,String plan){
	 boolean isCreated=false;
		 if(name!=null &&plan!=null)
		 {
			 this.name=name;
			 this.plan=plan;
			 isCreated=true;
		 }
		 return isCreated;
		 }
		 public void displaySimInfo(){
			 System.out.println("the name of simcard is:"+this.name);
			 System.out.println("plan is :"+this.plan);
		 }
	 }

 
 }
 }