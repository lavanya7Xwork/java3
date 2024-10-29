import java.util.*;

public class MainDiseaseNames {
    public static void main(String[] args) {
        //List<String >collection=new LinkedList<>();
       // Set<String >collection=new HashSet<>();
        Collection<String>collection=new ArrayList<>();
        collection.add("Acquired immunodeficiency syndrome (AIDS)");
        collection.add( " Bordetella (pertussis)");
        collection.add(" Campylobacteriosis" );
        collection.add( " Dengue");
        System.out.println("the disease names are"+ collection);
        Collection<String>collection1=new ArrayList<>();
         collection1.add(" Ebola virus disease");
         collection1.add(" Flu");
          collection1.add(" German measles (rubella)");
           collection1.add(" Haemophilus infection");
        System.out.println("the disease names is " +collection1);
           collection.addAll(collection1);
           collection.remove(" Dengue");
           collection.removeAll(collection1);
           collection.contains(" Dengue");
        Iterator<String > itr=collection.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
