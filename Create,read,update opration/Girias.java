import java.util.Arrays;
class Girias{
static String giriasLoc="Davangere";
static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean createHomeAppliances(String names){
boolean isGiriasCreated=false;
if(index<homeAppliances.length){
if(names!=null){
homeAppliances[index]=names;
index++;
isGiriasCreated=true;
}else
	System.out.println("item full..........");
}else {
	System.out.println("next time see");
}
return isGiriasCreated;
}
public static void getHomeAppliances(){
for(String names:homeAppliances){
System.out.println(names);
 }
}
public static boolean updateHomeApp(String oldName,String newName){
	boolean isupdate=false;
	for(int index=0;index<homeAppliances.length;index++)
	if(oldName==homeAppliances[index]){
		homeAppliances[index]=newName;
		isupdate=true;
	}
	else{
		System.out.println("not found");
	}
	return isupdate;
}
public static boolean deletedHomeApp(String homeAppTobeDeleted){
	boolean isdeleted=false;
	int newindex,oldindex;
	for(newindex=0,oldindex=0;oldindex<homeAppliances.length;oldindex++){
		if(homeAppliances[oldindex]!=homeAppTobeDeleted){
			homeAppliances[newindex]=homeAppliances[oldindex];
			newindex++;
		}
	}
		homeAppliances=Arrays.copyOf(homeAppliances,newindex);
		if(homeAppliances!=null){
			isdeleted=true;
		}
		if(isdeleted==false){
			System.out.println(homeAppTobeDeleted+"not found");
		}
	return isdeleted;
	
}
}
