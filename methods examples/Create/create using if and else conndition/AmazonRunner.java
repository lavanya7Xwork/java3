class AmazonRunner{
 public static void main(String g[]){
 boolean iscreateAmazonAccount=Amazon.createAmazonAccount("Lavanya","S",9353579405l,"lava123@S","favFood","palav");
 if(iscreateAmazonAccount==true)
 {
	 Amazon.getAmazonDetails();
   }
  }
 }