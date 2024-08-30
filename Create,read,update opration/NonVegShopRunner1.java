class Girias{
static String giriasLoc="Davangere";
static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean createHomeAppliances(String names){
boolean isGiriasCreated=false;
if(names!=null){
homeAppliances[index]=names;
index++;
isGiriasCreated=true;
 }
return isGiriasCreated;
}
public static void getHomeAppliances(){
for(String names:homeAppliances);{
System.out.println(names);
 }
}
public satatic boolean updateHomeApp(String oldName,String newName){
	boolean isupdate=false;
	for(int index=0;index<homeAppliances.length;index++)
	if(oldName=homeAppliances[index]){
		homeAppliances[index]=newName;
		isupdate=true;
	}
	else
		System.out.println("not found")
	}
}
