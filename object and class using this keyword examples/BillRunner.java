class BillRunner{
public static void main(String args[]){
Bill ref=new Bill();
boolean val=ref.createBill(428,"14/12/2000","1/1/2001",true,true);
         ref.displayBillInfo();
}
}