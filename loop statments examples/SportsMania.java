class SportsMania{

	static String iplTeamNames[]={"RCB","CSK","MI","KKR","GT","DC","LSG","RR","SRH","PBKSs"};
	static String batsMens[]={"Virat Kohli","K L Rahul","Rohit Sharma","SuryaKumarYadav","Rishab Pant","Shubman Gill","MS Dhoni","Shreyas Iyer","Sachin Tendulkar","Yuvraj Singh","Suresh Raina"};
	static String bowlers[]={"Siraj","Pathirana","Jadeja","Mohamad Shami","Arshdeep Singh","Bumhra","Harshel Patel","Hardik Pandya","Krunal Pandya","Chahal"};
	static String iccTeamNames[]={"India","Australia","South Africa","Pakistan","Newzeland","England","Srilanka","Bangladesh","Afghanistan","USA"};
	
	
public static void main(String sports[]){
		System.out.println("ipl team names are:");
		for(String iplTeamName:iplTeamNames)
		{
			System.out.println(iplTeamName);
		}
		System.out.println("icc batsmens names are:");
		for(String batsMens:batsMens)
		{
			System.out.println(batsMens);
		}
		System.out.println("icc bowlers names are:");
		for(String bowler: bowlers)
		{
			System.out.println(bowler);
		}
		System.out.println("icc team names are:");
		for(String iccTeamName:iccTeamNames)
		{
			System.out.println(iccTeamName);
		}
}
}
			
		
