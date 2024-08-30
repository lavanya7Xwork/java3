import java.util.Arrays;
class Bar{
	static String wineBrand[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addWineBrands(String brand){
		boolean isbrand=false;
		if(index<wineBrand.length){
			if(brand!=null){
				wineBrand[index]=brand;
				index++;
				isbrand=true;
			}else
				System.out.println("brand not found");
	}else{
		System.out.println("next time........");
			}
			return isbrand;
	}
	public static void getAllBrands(){
		for(String brand:wineBrand){
			System.out.println(brand);
		}
	return;
	}
	public static boolean updateWineBrand(String oldNme,String newName){
		boolean isupdatebrand=false;
		for(int index=0;index<wineBrand.length;index++)
			if(oldNme==wineBrand[index]){
				wineBrand[index]=newName;
				isupdatebrand=true;
			}else{
				System.out.println("not updated");
	  }
	  return isupdatebrand;
	}
	public static boolean deleteWineBrand(String wineBrandDeleted){
		boolean isdeleted=false;
		int newindex,oldindex;
		for(newindex=0,oldindex=0;oldindex<wineBrand.length;oldindex++){
			if(wineBrand[oldindex]!=wineBrandDeleted){
				wineBrand[newindex]=wineBrand[oldindex];
				newindex++;
			}
		}
		wineBrand=Arrays.copyOf(wineBrand,newindex);
		if(wineBrand!=null){
			isdeleted=true;
		}
		if(isdeleted==false){
			System.out.println(wineBrandDeleted+"not found");
		}
		return isdeleted;
	}
}