import java.util.Arrays;
class Liberty{
static String shoeName[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addShoeBrands(String brandName){
boolean isbrand=false;
if(index<shoeName.length){
if(brandName!=null){
shoeName[index]=brandName;
index++;
isbrand=true;
}else System.out.println("shoess are full....");
}else{
System.out.println("let's see next time......");
}
return isbrand;
}
public static void getAllShoeBrands(){
for(String brandName:shoeName){
System.out.println(brandName);
}
}
public static boolean updateShoeBrand(String oldName,String newName){
boolean isupdate=false;
for(int index=0;index<shoeName.length;index++)
if(oldName==shoeName[index]){
shoeName[index]=newName;
isupdate=true;
}else{
System.out.println("not found");
}
return isupdate;
}
public static boolean deleteShoeBrand(String sheoBrandNameTobeDeleted){
	boolean isdeleted=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<shoeName.length;oldIndex++){
		if(shoeName[oldIndex]!=sheoBrandNameTobeDeleted){
			shoeName[newIndex]=shoeName[oldIndex];
			newIndex++;
		}
	}
	shoeName=Arrays.copyOf(shoeName,newIndex);
	if(shoeName!=null){
		isdeleted=true;
	}
	if(isdeleted==false){
		System.out.println(sheoBrandNameTobeDeleted+"not found");
	}
	return isdeleted;
}
}