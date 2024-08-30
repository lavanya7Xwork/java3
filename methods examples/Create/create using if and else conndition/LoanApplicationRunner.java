class LoanApplicationRunner{
	
	public static void main(String P[]){
		
   boolean isLoanCreate= LoanApplication.createLoan("Lavanya","S","11/05/2002","lavanyaslavanyas732@gmail.com","lavanyaslavanyas732@gmail");
	if(isLoanCreate==true)
	{
		LoanApplication.getLoanDetails();
	}
  }
}