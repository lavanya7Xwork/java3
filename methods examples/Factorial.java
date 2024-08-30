class Factorial{

	//Purpose of factorial is to get the fact
	public static void toGetFact(int factorial)
	{
		System.out.println("Fact is started");
		int fact=1;
		for(int num=1;num<=factorial;num++ )
	{
		fact=fact*num;
	}
		System.out.println(fact);
		System.out.println("Fact is ended");
	}
	}
	