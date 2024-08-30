class Factorial1{

	public static int toGetFact(int factNumber)
	{
	int fact=1;//suppose to get the updated data
	for(int num=1;num<=factNumber;num++)
	{
	fact=num*fact;
	}
	System.out.println(fact);
	}
	}