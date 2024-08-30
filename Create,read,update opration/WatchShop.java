import java.util.Arrays;
class WatchShop{
static String watchShop[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addWatchBrandNames(String brand){
boolean isBrandNames=false;
if(index<watchShop.length){
if(brand!=null){
watchShop[index]=brand;
index++;
isBrandNames=true;
}else
System.out.println("collactions are full");
}else{
System.out.println("not now.... next time");
 }
 return isBrandNames;
}
public static void getAllWatchBrands(){
for(String brand:watchShop){
System.out.println(brand);
 }
 return;
}
public static Boolean updateWatchBrands(String oldName,String newName){
boolean isupdateBrand=false;
for(int index=0;index<watchShop.length;index++)
if(oldName==watchShop[index]){
watchShop[index]=newName;
isupdateBrand=true;
}else{
System.out.println("watchBrand Name not found");
}
return isupdateBrand;
 }
 public static boolean deleteWatchBrand(String watchBrandTobeDeleted){
	 boolean isdeleted=false;
	 int newIndex,oldIndex;
	 for(newIndex=0,oldIndex=0;oldIndex<watchShop.length;oldIndex++){
		 if(watchShop[oldIndex]!=watchBrandTobeDeleted){
			 watchShop[newIndex]=watchShop[oldIndex];
			 newIndex++;
		 }
	 }
	 watchShop= Arrays.copyOf(watchShop,newIndex);
	 if(watchShop!=null){
		 isdeleted=true;
	 }
	 if(isdeleted==false){
		 System.out.println(watchBrandTobeDeleted+"not found");
	 }
 return isdeleted;
}
}
