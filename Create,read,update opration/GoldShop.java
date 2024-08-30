import java.util.Arrays;//pakages in java
class GoldShop{
static String shopName="Laxmi GoldShop";
static String GoldShop[]={null,null,null,null,null,null,null};
static int index;

public static boolean addGoldItem(String goldName){
System.out.println("addGoldItem is started");
boolean isGoldNames=false;
      //0<7 (7 is the fix value in array we given)
if(index<GoldShop.length){
if(goldName!=null){
GoldShop[index]=goldName;
index++;
isGoldNames=true;
 }else System.out.println("items are full.....");
}else{
 System.out.println("let's see next time");
 System.out.println("addGoldItem is ended");
 }
return isGoldNames;
}

public static void GetAllGoldItem(){
	System.out.println("GetAllGoldItem started");
	for(String goldName:GoldShop){
		System.out.println(goldName);
	}
	System.out.println("GetAllGoldItem ended");	
	return;
}

public static boolean updateGoldItem(String oldName,String newName){
	System.out.println("updateGoldItem started");
	boolean isGoldItems=false;
	for(int index=0;index<GoldShop.length;index++)
	if(oldName==GoldShop[index]){
		GoldShop[index]=newName;
		isGoldItems=true;
	 }
	 if(isGoldItems==true){
		System.out.println("goldName not there");
	 }
	System.out.println("updateGoldItem ended");
	return isGoldItems;
 }	
 //delete method
 public static boolean deleteGoldItem(String goldNameTobeDeleted){	
	 boolean isdeleted=false;
	 int newIndex,oldIndex;//declration,
	 //oldName is that exitisting name,
	//giving only oldName==0,it does't work in industry
	 for(newIndex=0,oldIndex=0;oldIndex<GoldShop.length;oldIndex++){
		 if(GoldShop[oldIndex]!=goldNameTobeDeleted){
			 GoldShop[newIndex]=GoldShop[oldIndex];
			newIndex++;//
		 }
	 }
	 GoldShop=Arrays.copyOf(GoldShop,newIndex);
	 if(GoldShop!=null){
		 isdeleted=true; 
	 }
	 if(isdeleted==false){
		 System.out.println(goldNameTobeDeleted +"not found");
	 }
	 return isdeleted;
 }
}