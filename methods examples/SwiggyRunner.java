class SwiggyRunner{
public static void main(String foodName[]){
      System.out.println("Main started"); 
	  double value = Swiggy.takingTheOrdering("paav Bhaji",2);
      System.out.println(" paav bhaji amount is "+value);
      double value1=Swiggy.takingTheOrdering("jeera Rice",4);
	  System.out.println(" jeera rice amount is "+value1);
	  System.out.println("Main ended");
  }
}
