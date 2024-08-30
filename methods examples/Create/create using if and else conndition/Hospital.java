class Hospital{
static String fastNm;
static int tm;
static String fromLoc;
static String desis;
static String amtPay;
public static boolean findPatient(String fastName,int time,String fromLocation,String desise,String amountPay){
  boolean isPatientDocument=false;
  boolean isFastNameValid=false;
  boolean isTimeValid=false;
  boolean isFromLocationValid=false;
  boolean isDesiseValid=false;
  boolean isAmountPayValid=false;
  if(fastNm!=null){
	  fastNm=fastName;
	  isFastNameValid=true;
  }else{
	  System.out.println("please enter the valid fastName");
  }
  if(tm>=0){
	  tm=time;
	  isTimeValid=true; 
  }else{
	  System.out.println("please see the valid time");
  }
  if(fromLoc!=null){
	  fromLoc=fromLocation;
	  isFromLocationValid=true;
  }else{
	  System.out.println("please enter the valid fromLocation");
  }
  if(desis!=null){
	  desis=desise;
	  isDesiseValid=true;
  }else{
	  System.out.println("please enter the valid desise");
  }
  if(amtPay!=null){
	  amtPay=amountPay;
	  isAmountPayValid=true;
  }else{
	  System.out.println("Please enter the Amount Pay off");
  }
  if(isFastNameValid&&isTimeValid&&isFromLocationValid&&isAmountPayValid&&isDesiseValid){
	  isPatientDocument=true;
  }
  return isPatientDocument;
}
  public static void getDetails(){
  System.out.println("Enter fastName is "+fastNm);
  System.out.println("Train timing on "+tm);
  System.out.println("Enter the Your Location "+fromLoc);
  System.out.println("Enter the Destination to GO "+desis);
  System.out.println("Search here to "+amtPay);
  }
 }