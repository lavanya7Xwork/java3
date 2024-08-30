import java.util.Arrays;
class Textiles{
static String materialNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMaterial(String name){
boolean isMaterial=false;
if(index<materialNames.length){
if(name!=null){
materialNames[index]=name;
index++;
isMaterial=true;
}else
System.out.println("it is full");
}else{
System.out.println("see for next time");
}
return isMaterial;
}
public static void getAllMaterial(){
for(String name:materialNames){
System.out.println(name);
}
}
public static boolean updateMaterial(String oldName,String newName){
 boolean isupdate=false;
 for(int index=0;index<materialNames.length;index++)
 if(oldName==materialNames[index]){
 materialNames[index]=newName;
 isupdate=true;
 }else{
 System.out.println("oldName not found");
  }
  return isupdate;
 }
 public static boolean deleteMaterial(String materialNamesTobeDeleted){
	 boolean isdeleted=false;
	 int newIndex,oldIndex;
	 for(newIndex=0,oldIndex=0;oldIndex<materialNames.length;oldIndex++){
		 if(materialNames[index]!=materialNamesTobeDeleted){
			 materialNames[newIndex]=materialNames[oldIndex];
			 newIndex++;
		 }
	 }
	 materialNames=Arrays.copyOf(materialNames,newIndex);
		if(materialNames!=null){
			isdeleted=true;
		} 
	 if(isdeleted==false){
		 System.out.println(materialNamesTobeDeleted+"not found");
	 }
	 return isdeleted;
 }
}

