class TrainApp{
static String fastNm;
static int tm;
static String fromLoc;
static String toLoc;
static String srch;
public static boolean findTrain(String fastName,int time,String fromLocation,String toLoacation,String search){
  boolean isTrainApp=false;
  fastNm=fastName;
  tm=time;
  fromLoc=fromLocation;
  toLoc=toLoacation;
  srch=search;
  return isTrainApp;
}
  public static void getDetails(){
  System.out.println("Enter fastName is "+fastNm);
  System.out.println("Train timing on "+tm);
  System.out.println("Enter the Your Location "+fromLoc);
  System.out.println("Enter the Destination to GO "+toLoc);
  System.out.println("Search here to "+srch);
  }
 }