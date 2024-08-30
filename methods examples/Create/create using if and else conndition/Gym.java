import java.util.Arrays;
class Gym{
static String gymName="powerPluse";
static String gymLoc="rajajinargar";
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int gymindex;
public static boolean createGymEquipments(String items){
boolean isGymDetailsCreated=false;
if(gymindex<gymEquipments.length){
if(items!=null){
gymEquipments[gymindex]=items;
gymindex++;
isGymDetailsCreated=true;
  }else
  System.out.println("please enter the valid equipments");
  }else{
	System.out.println("next time......");  
  }
  return isGymDetailsCreated;
}
public static void getGymEquipments(){
for(String items:gymEquipments)
System.out.println(items);
return;
}
public static boolean updateGymQuipments(String oldName,String newName){
	boolean isupdate=false;
	for(int gymindex=0;gymindex<gymEquipments.length;gymindex++)
		if(oldName==gymEquipments[gymindex]){
			gymEquipments[gymindex]=newName;
			isupdate=true;
		}
	else{
			System.out.println("not found");
	}
	return isupdate;
}
public static boolean deleteGymEquipments(String gymQuipmentsTobeDeleted){
	boolean isDeleted=false;
	int newIndex,oldIndex;
	for( newIndex=0,oldIndex=0;oldIndex<gymEquipments.length;oldIndex++){
		if(gymEquipments[oldIndex]!=gymQuipmentsTobeDeleted){
			gymEquipments[newIndex]=gymEquipments[oldIndex];
			newIndex++;
		}
	}
	gymEquipments= Arrays.copyOf(gymEquipments,newIndex);
	if(gymEquipments!=null){
		isDeleted=true;
	}
	if(isDeleted==false)
		System.out.println(gymQuipmentsTobeDeleted+"not found");
return isDeleted;
   }
}
