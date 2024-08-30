class NewsPaperRunner{
public static void main(String paper[]){
	
NewsPaper ref1 =  new NewsPaper();
boolean val1=ref1.currentAffairs("Indian Express",18,"English");
ref1.displayNewsPaperInfo();

NewsPaper ref2 =  new NewsPaper();
boolean val2=ref2.currentAffairs("Vijay Karnataka",30,"Kannada");
ref2.displayNewsPaperInfo();

NewsPaper ref3 =  new NewsPaper();
boolean val3=ref3.currentAffairs("Kannada Prabha",15,"Kannada");
ref3.displayNewsPaperInfo();

NewsPaper ref4 =  new NewsPaper();
boolean val4=ref4.currentAffairs("VijayaVani",28,"Kannada");
ref4.displayNewsPaperInfo();

NewsPaper ref5 =  new NewsPaper();
boolean val5=ref5.currentAffairs("Hindustan",23,"Hindi");
ref5.displayNewsPaperInfo();

NewsPaper ref6 =  new NewsPaper();
boolean val6=ref6.currentAffairs("Prajavani",27,"Kannada");
ref6.displayNewsPaperInfo();

NewsPaper ref7 =  new NewsPaper();
boolean val7=ref7.currentAffairs("The hindu",30,"English");
ref7.displayNewsPaperInfo();

NewsPaper ref8 =  new NewsPaper();
boolean val8=ref8.currentAffairs("The times of India",18,"English");
ref8.displayNewsPaperInfo();

NewsPaper ref9 =  new NewsPaper();
boolean val9=ref9.currentAffairs("The Indian Express",10,"English");
ref9.displayNewsPaperInfo();

NewsPaper ref10 =  new NewsPaper();
boolean val10=ref10.currentAffairs("Amar Ujala",14,"Hindi");
ref10.displayNewsPaperInfo();

NewsPaper value =  new NewsPaper();
boolean val11=value.currentAffairs("Rajastan Patrika",8,"Hindi");
value.displayNewsPaperInfo();

NewsPaper add =  new NewsPaper();
boolean val12=add.currentAffairs("Deccan herald",11,"English");
add.displayNewsPaperInfo();

NewsPaper sub =  new NewsPaper();
boolean val13=sub.currentAffairs("The Economic Times",10,"English");
sub.displayNewsPaperInfo();

NewsPaper rel =  new NewsPaper();
boolean val14=rel.currentAffairs("Blitz",29,"Telugu");
rel.displayNewsPaperInfo();

NewsPaper refs =  new NewsPaper();
boolean val15=refs.currentAffairs("Musalman",10,"Urdu");
refs.displayNewsPaperInfo();

} 
}