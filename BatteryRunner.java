class BatteryRunner{
public static void main(String args[]){

Battery ref0 = new Battery();
boolean val0=ref0.charge("Carbon Zinc battery","13 gm");
ref0.displayBatteryInfo();
   
   Battery ref = new Battery();
   boolean val1=ref.charge("Exide","18 gm");
   ref.displayBatteryInfo();

    Battery ref1 = new Battery();
	boolean val2=ref1.charge("AAA battery","15 gm");
   ref1.displayBatteryInfo();

Battery ref2 = new Battery();
boolean val3=ref1.charge("Flow battery","14 gm");
   ref2.displayBatteryInfo();

Battery ref3 = new Battery();
boolean val4=ref3.charge("Lithium battery","17 gm");
   ref3.name="Lithium battery";
   ref3.displayBatteryInfo();

Battery ref4 = new Battery();
boolean val5=ref4.charge("23A Batteries","16 gm");
   ref4.displayBatteryInfo();

Battery ref5 = new Battery();
boolean val6=ref5.charge("Battery Pack","20 gm");
   ref5.displayBatteryInfo();
   
   Battery ref7= new Battery();
   boolean val7=ref7.charge("Okaya Power","20gm");
   ref7.displayBatteryInfo();
   
   Battery ref6 = new Battery();
   boolean val8=ref6.charge("Mercury Battery ","20gm");
   ref6.displayBatteryInfo();
   
   Battery ref8 = new Battery();
   boolean val9=ref8.charge("Su-Kam","12 gm");
   ref8.displayBatteryInfo();
   
   
   Battery ref9 = new Battery();
   boolean val10=ref9.charge("Luminous","14 gm");
   ref9.displayBatteryInfo();
   
   Battery ref10 = new Battery();
   boolean val11=ref10.charge("Mercury Battery","20gm");
   ref10.displayBatteryInfo();
   
   Battery ref11 = new Battery();
   boolean val12=ref11.charge("Penny Battery","20gm");
   ref11.displayBatteryInfo();
   
   Battery ref12= new Battery();
   boolean val13=ref12.charge("Orion Battery","21 gm");
   ref12.displayBatteryInfo();
   
   
   Battery ref14 = new Battery();
   boolean val14=ref14.charge("Byd","16 gm");
   ref14.displayBatteryInfo();

}
}