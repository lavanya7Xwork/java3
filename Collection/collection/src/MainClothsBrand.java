import java.util.*;

public class MainClothsBrand {
    public static void main(String[] args) {
        List<String> collection= new LinkedList<>();
        //Set<String >collection=new HashSet<>();
        collection.add("H&m");
        collection.add("Zara");
        collection.add("Nike");
        collection.add( "Peter England");
        collection.add( "Calvin Klein");
        System.out.println("Brand names first five  are" +collection);

        List <String>collection1=new LinkedList<>();
        collection1.add("Allen Solly");
        collection1.add("Blue Chic");
        collection1.add("Fabindia");
        collection1.add("Flying Machine");
        collection1.add("Biba");
        System.out.println("Brand names of  are " +collection1);
        collection.add(2,"Mufti");

        collection.addAll(collection1);
        collection.remove("Calvin Klein");
        String clothBrandNames=collection.get(6);
         System.out.println("the get name is "+clothBrandNames);

        //collection.clear();
        System.out.println(collection.size());

        //collection.removeAll(collection1);

        /*for(String st:collection) {
            System.out.println(st);
       }*/
                    //OR
        Iterator<String> itr=collection.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
  }
}