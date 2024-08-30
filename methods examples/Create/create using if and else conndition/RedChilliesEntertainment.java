import java.util.Arrays;
class RedChilliesEntertainment{
static String redchiiesLoc="smg";
static String moviesActors[]={null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMoviesActors(String brand){
boolean isCreated=false;
if(index<moviesActors.length){
if(brand!=null){
moviesActors[index]=brand;
index++;
isCreated=true;
 }else
	 System.out.println("it is full");
}else{
	System.out.println("next time..........");
}
return isCreated;
}
public static void getMoviesActors(){
for(String brand:moviesActors){
System.out.println(brand);
}
}
public static boolean updateMoviesActors(String oldName,String newName){
	boolean isupdate=false;
	for(int index=0;index<moviesActors.length;index++)
		if(oldName==moviesActors[index]){
			moviesActors[index]=newName;
			isupdate=true;
			
		}
	else{
		System.out.println("not found");
	}
	return isupdate;
	}
public static boolean deleteMoviesActors(String moviesActorsTobeDeleted){
	boolean isDelete=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<moviesActors.length;oldIndex++){
		if(moviesActors[oldIndex]!=moviesActorsTobeDeleted){
			moviesActors[newIndex]=moviesActors[oldIndex];
			newIndex++;
		}
	}
	moviesActors= Arrays.copyOf(moviesActors,newIndex);
	if(moviesActors!=null)
		isDelete=true;
	if(isDelete==false){
		System.out.println(moviesActorsTobeDeleted+"not found");
	}
	return isDelete;
}
}