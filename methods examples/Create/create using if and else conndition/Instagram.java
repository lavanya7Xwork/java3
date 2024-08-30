class Instagram{
static String urNm;
static String gmlId;
static String gndr;
static long phNo;
static String pwd;
public static boolean getOnIt(String userName,String gmailId,String gender,long phoneNumber,String passward);
{
boolean ischatSport=false;
boolean isUserNameValid=false;
boolean isGmailIdValid=false;
boolean isGenderValid=false;
boolean isPhoneNumberValid=false;
boolean isPasswardValid=false;
if(urNm!=null){
	urNm=userName;
	isUserNameValid=true;
}else{
	System.out.println("Enter the valid username");
}
if(gmlId!=null){
	gmlId=gmailId;
	isGmailIdValid=true;
}else{
		System.out.println("Enter the valid gmailid");
}
if(gndr!=null){
	gndr=gender;
	isGenderValid=true;
}else{
	System.out.println("please enter urs gender");
}
if(phNo>=0){
	phNo=phoneNumber;
	isPhoneNumberValid=true;
}else{
	System.out.println("please enter ur phoneNumber");
}
if(pwd!=null){
	pwd=passward;
	isPasswardValid=true;
}else{
	System.out.println("enter the valid passward");
}
return ischatSport;
}
public static void getInstaDetails(){
System.out.println("Enter the user Name"+urNm);
System.out.println("Enter your gmail id "+gmlId);
System.out.println("Show online"+gndr);
System.out.println("Exit here"+pwd);
System.out.println("Exit here"+phNo);

 }
}