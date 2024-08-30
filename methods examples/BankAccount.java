class BankAccount{
static double balance;
public static void credit(double amount){
	System.out.println("credit main started");
balance=balance+amount;
if(amount<=balance){
System.out.println("credit main ended");
}else{
	System.out.println("not funds");
}
return;
}
public static void debit(double amount){
	System.out.println("debit main started");
balance=balance-amount;
if(amount>0){
	System.out.println("amount can't be zero");
}
System.out.println("debit main ended");
return;
}
public static double getBalance(){
	System.out.println("getBalance main started");
System.out.println("getBalance main ended");
return balance;
 }
}
