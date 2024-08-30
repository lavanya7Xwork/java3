class Television{
static boolean isConnected=false;
static int currentVolume;
static int maxVolume= 10;
static int minVolume;

public  static void onOrOff(){
System.out.println("onOrOff started");
if(isConnected==false){
    isConnected=true;
	System.out.println("Television is on");
	}
	else if(isConnected==true){
	     isConnected=false;
		System.out.println("Television is off"); 
        System.out.println("onOrOff ended");
   return ;
 }
}
public static void increaseVolume(){
				 System.out.println("increaseVolume() started");
			if(isConnected == true){	       
				 if(currentVolume <maxVolume){
					    currentVolume= currentVolume+1;						;
				System.out.println("The current Volume is "+ currentVolume);		
				}else{
						System.out.println("Max Volume Reached");
					 } 
			}else{
				System.out.println("Gubee...  On Maadu....");
			}
				 	 System.out.println("increaseVolume() ended");
				 return ;
				 }
 public static void decreaseVoume(){
	 System.out.println("decreaseVolume() started");
	 if(isConnected==true){
		 if(currentVolume>minVolume){
			 currentVolume=currentVolume-1;
			 System.out.println("The current Volume is "+ currentVolume);
		 }
		 else{
			 System.out.println("Min Volume Reached");
		 }
	 }else{
			 System.out.println("hey.....  off karo....");
			 
		 }
	 
		 System.out.println("decreaseVolume() ended");
		 return;
 }
}
