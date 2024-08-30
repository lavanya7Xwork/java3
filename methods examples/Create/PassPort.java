class Passport{
	static String cprLoc;
	static int dcdrLoc;
	static String givenNm;
	static String surNm;
	static int dob;
	static String emailId;
	static boolean emailLoginSame;
    static String loginId;
    static String pwd;
	static String confimdpwd;
	static String hintQues;
	static String hintAns;
	static String captch;
	public static boolean createPassport(String cvpLoacation,int dcdrLocation,String givenName,String surName,String dob,String emailId,boolean emailLoginSame,String loginId,String pwd,String confimdpwd,String hintQues,String hintAns,String captch){
    boolean isPassportDataCreate=false;
	cprLoc= cprLoc;
	dcdrLoc= dcdrLoc;
	givenNm= givenNm;
	surNm=surNm;
	dob=dob;
	emailId=emailId;
	emailLoginSame=emailLoginSame;
	loginId=loginId;
	pwd=pwd;
	confimdpwd=confimdpwd;
	hintQues=hintQues;
	hintAns=hintAns;
	return isPassportDataCreate;
	}
	public static void getPassportDetails(){
		System.out.println("The cpr Location is:"+cprLoc);
		System.out.println("The dcdr Location is:"+dcdrLoc);
		System.out.println("The givenNameis:"+givenNm);
	    System.out.println("The surName is:"+surNm);
		System.out.println("Data birth :"+dob);
		System.out.println("emaild:"+emailId);
		System.out.println("emailLoginSame:"+emailLoginSame);
		System.out.println("loginId:"+loginId);
		System.out.println("pwd:"+pwd);
		System.out.println("confimdpwd:"+confimdpwd);
		System.out.println("hintQues:"+hintQues);
		System.out.println("hintAns:"+hintAns);								
	}
}