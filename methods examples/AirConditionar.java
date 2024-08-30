class AirConditionar{
static boolean isConnected=false;
static int currentTemperature;
static int maxTemperature= 7;
static int minTemperature;

public  static void onOrOff(){
System.out.println("onOrOff started");
isConnected=(isConnected==false) ?true:false;
	System.out.println("AirConditionar is on");
		System.out.println("AirConditionar is off"); 
        System.out.println("onOrOff ended");
   return isConnected ;
   
public static void increaseTemperature(){
				 System.out.println("increaseTemperature() started");
			if(isConnected == true){	       
				 if(currentTemperature <= maxTemperature){
					    currentTemperature= currentTemperature+1 ;
				System.out.println("The current temperature is "+ currentTemperature);		
				}else{
						System.out.println("Max Temperature Reached");
					 } 
			}else{
				System.out.println("Gubee... Ac na On Maadu....");
			}
				 	 System.out.println("increaseTemperature() ended");
				 return ;
				 }
 public static void decreaseTemperature(){
	 System.out.println("decreaseTemperature() started");
	 if(isConnected==false){
		 if(currentTemperature<=minTemperature){
			 currentTemperature=currentTemperature+1;
			 System.out.println("The current temperature is "+ currentTemperature);
		 }
		 else{
			 System.out.println("Min Temperature Reached");
		 }
	 }else{
			 System.out.println("hey..... Ac off karo....");
			 
		 }
	 
		 System.out.println("decreaseTemperature() ended");
		 return;
}
public static void getDetails(){
String name="Sumsung";
     double  price=20000.00;
System.out.println("The brand name is :"+name);
System.out.println("The brand price is :"+price);
 }
}