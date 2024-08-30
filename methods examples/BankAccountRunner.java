class BankAccountRunner{
public static void main(String args[])
{
	System.out.println("main started");
BankAccount.credit(9000);
double output= BankAccount.getBalance();
System.out.println(output);
BankAccount.credit(4000);
output=BankAccount.getBalance();
System.out.println(output);
BankAccount.debit(0);
 output=BankAccount.getBalance();
System.out.println(output);
System.out.println("main ended");

}
}