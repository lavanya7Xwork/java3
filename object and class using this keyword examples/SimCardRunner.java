class SimCardRunner{
	public static void main(String s[]){
		
		SimCard ref=new SimCard();
		boolean val=ref.communication("jio","talk-time");
		ref.displaySimInfo();
		
		SimCard ref1=new SimCard();
		boolean val1=ref1.communication("Airtal","1month");
		ref1.displaySimInfo();
		
		SimCard ref2=new SimCard();
		boolean val2=ref2.communication("idea","1year");
		ref2.displaySimInfo();
		
		SimCard ref3=new SimCard();
		boolean val3=ref3.communication("BSNL","2year");
		ref3.displaySimInfo();
		
		SimCard ref4=new SimCard();
		boolean val4=ref4.communication("Vodafone","2year");
		ref3.displaySimInfo();
		
		SimCard ref5=new SimCard();
		boolean val5=ref5.communication("Tata Docoma","299 days");
		ref5.displaySimInfo();
		
		SimCard ref6=new SimCard();
		boolean val7=ref6.communication("T-Mobile US","159 days");
		ref3.displaySimInfo();
		
		SimCard ref7=new SimCard();
		boolean val8=ref7.communication("China Telecom","199 days");
		ref7.displaySimInfo();
		
		SimCard ref8=new SimCard();
		boolean val9=ref9.communication("Uninor","299");
		ref8.displaySimInfo();
		
		SimCard ref9=new SimCard();
		boolean val10=ref9.communication("MTS","299");
		ref9.displaySimInfo();
		
		SimCard ref10=new SimCard();
		boolean val11=ref10.communication("MTS","299");
		ref10.displaySimInfo();
		
   SimCard ref11 = new SimCard();
   boolean vall2=ref11.communication("jio","336days 1899Rs");
   ref11.displaySimInfo();
   
   SimCard ref12 = new SimCard();
   boolean val13=ref12.communication("Aircel","999");
   ref12.displaySimInfo();
		
   SimCard ref13 = new SimCard();
   boolean val14=ref13.communication("Reliance Jio","789");
   ref13.displaySimInfo();
   
   SimCard ref14=new SimCard();
   boolean val15=ref14.communication("MTs","2months");
   ref14.displaySimInfo();


	}
}