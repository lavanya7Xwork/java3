class NewsPaper{
    
	String companyName;
	int noOfPages;
	String language;
	  public boolean currentAffairs(String companyName,int noOfPages,String language){
		 boolean isCreated=false;
		 if(companyName!=null && noOfPages>0&&language!=null)
		 {
			 this.companyName=companyName;
			 this.noOfPages=noOfPages;
			 this.language=language;
			 isCreated=true;
		 }
		 return isCreated;
		 }
		 public void displayNewsPaperInfo(){
			 System.out.println("the name of newspaper is:"+this.companyName);
			 System.out.println("noOfPages:"+this.noOfPages);
			 System.out.println("language is :"+this.language);
		 }
	 }
 