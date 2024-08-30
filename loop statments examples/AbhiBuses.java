class AbhiBuses{

	static String busNames[]={"Sea Bird","Vrl","Srs","Praveen","Rajahamsa"};
	
	//methods
	
	public static void getBusNames(){
	for(String busName :busNames){
		System.out.println(busName);
	}
	}
	public static void main(String []bus){
	System.out.println("The available buses are: ");
	getBusNames();
		
		}
		}