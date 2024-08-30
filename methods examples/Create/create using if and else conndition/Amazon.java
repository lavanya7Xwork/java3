class Amazon{
static String fastNm ;
static String lastNm ;
static long phNo ;
static String pwd ;
static String hintQn ;
static String hintAn;
public static boolean createAmazonAccount(String fastName,String lastName,long phoneNo,String password,String hintQuestion,String hintAnswer)
{
boolean isAmazonAcc=false;
boolean isFastNameVaild=false;
boolean isLastNameValid=false;
boolean isPasswordValid=false;
boolean isHintAnswerValid=false;
boolean isHintQuestionValid=false;
if(fastNm!=null){
	fastNm=fastName;
	isFastNameVaild=true;
  }
  else{
	  System.out.println("please provide the valid fastName");
  }
  if(lastNm!=null){
	  lastNm=lastName;
	  isLastNameValid=true;
  }
  else{
	  System.out.println("please provide the valid lastname");
  }
  if(pwd!=null){
	  pwd=password;
     isPasswordValid=true;
  }else{
	   System.out.println("please provide the vaild password");
   }
   if(hintAn!=null){
	   hintAn=hintAnswer;
	  isHintAnswerValid=true;
   }
   else{
	   System.out.println("please provide the vaild hintAnswer");
   }
   if(hintQn!=null){
	   hintQn=hintQuestion;
      isHintQuestionValid=true;
     }
	 else{
		 System.out.println("please provide the vaild hintQuestion");
	 }
  if(isFastNameVaild&&isLastNameValid&&isPasswordValid&&isHintAnswerValid&&isHintQuestionValid){
	  isAmazonAcc=true;
  }
  return isAmazonAcc; 
 }
public static void getAmazonDetails(){
System.out.println("fastName is "+fastNm);
System.out.println("lastName is "+lastNm);
System.out.println("PhoneNumber is "+phNo);
System.out.println("password is "+pwd);
System.out.println("given hintQuestion is "+hintQn);
System.out.println("hidden Answer is "+hintAn);
  }
}