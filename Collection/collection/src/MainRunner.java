import java.util.*;

public class MainRunner {
    public static void main(String[] args) {
        //Order list of data
        List <String> collection = new LinkedList();
        //unOrder list of  data
        //Set<String> collection=new HashSet<>();
        collection.add("Fun World");
        collection.add("Snow City Bengaluru");
        collection.add("Wonderla");
        collection.add("GRS Fantasy Park");
        collection.add("Vels Innovative Film city");
        collection.add("Crazy Water Park");
       collection.add(5,"Jawahar Bal Bhavan Auditor");
     //System.out.println(collection.get(2));

        // this is for only one data should be fetch in List object make the list as object
        //String amusementParkName=collection.get(2);
       // System.out.println("the get name is "+ amusementParkName);
        //using iterator fetching a  all the data
       //Iterator<String >itr=collection.iterator();
       // System.out.println("give the list of amusement parks names");

       /* while (iterator.hasNext()){
            String amusementParkName=iterator.next();
            if(amusementParkName.startsWith("V"))
                System.out.println(amusementParkName);
         //System.out.println(itr.next());
            */
        for(String amusementPark:collection){
            if(amusementPark!=null){
                if(amusementPark.startsWith("V"))
                    System.out.println(amusementPark);
                }
            }
       }
    }

