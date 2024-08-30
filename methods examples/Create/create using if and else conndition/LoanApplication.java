class LoanApplication{
	static String givenNm;
	static String surNm;
	static String dob;
	static String emailIddddd;
	static String emailLoginSameeeee;
	public static boolean createLoan(String DateOfBirth,String givenName,String surName,String emailId,String emailLoginSame){
    boolean isLoanDataCreate=false;
	boolean isDateOfBirthValid=false;
	boolean isEmailIdValid=false;
	boolean isSurNameValid=false;
	boolean isEmailLoginSameValid=false;
	boolean isGivenNameValid=false;
	if(dob!=null){
		dob=DateOfBirth;
		isDateOfBirthValid=true;
	}else{
		System.out.println("please provide the valid dateofbirth");
	}
    if (emailIddddd!=null){
		emailIddddd=emailId;
		isEmailIdValid=true;
	}else{
	System.out.println("please provide the valid emailId");
	}
	if(surNm!=null){
		surNm=surName;
		isSurNameValid=true;
	}
	else{
		System.out.println("please provide the valid surName");
	}
	if(givenNm!=null){
		givenNm=givenName;
		isGivenNameValid=true;
	}
	else{
		System.out.println("please provide the valid GivenName");
	}
	if(emailLoginSameeeee!=null){
		emailLoginSameeeee=emailLoginSame;
		isEmailLoginSameValid=true;
	}
	else{
		System.out.println("please provide the valid emailLoginSame");
	}
	if(isEmailIdValid&&isDateOfBirthValid&&isSurNameValid&&isGivenNameValid&&isEmailLoginSameValid){
		isLoanDataCreate=true;
	}
	return isLoanDataCreate;
	}
	public static void getLoanDetails(){
		System.out.println("The givenName is:"+givenNm);
	    System.out.println("The surName is:"+surNm);
		System.out.println("Data birth :"+dob);
		System.out.println("emaild:"+emailIddddd);
		System.out.println("emailLoginSame:"+emailLoginSameeeee);							
	}
}