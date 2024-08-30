class Google{
static String fastNm ;
static String lastNm ;
static long phNo ;
static String pwd ;
static String hintQ ;
static String hintA;
public static boolean createGmailAccount(String fastName,String lastName,long phoneNo,String password,String hintQuestion,String hintAnswer)
 {
boolean isGmailAcc=false;
boolean isFastNameVaild=false;
boolean isLastNameValid=false;
boolean isPasswordValid=false;
boolean isHintQValidValid=false;
if(fastNm!=fastName){
	fastNm=fastName;
	isFastNameVaild=true;
  }else{
	  System.out.println("please provide the valid fastName");
  }
 }
public static void getGmailDetails(){
System.out.println("fastName is "+fastNm);
System.out.println("lastName is "+lastNm);
System.out.println("PhoneNumber is "+phNo);
System.out.println("password is "+pwd);
System.out.println("given hintQuestion is "+hintQ);
System.out.println("hidden Answer is "+hintA);

  }
}