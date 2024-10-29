import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainPoetWriterNames {
    public static void main(String[] args) {
        Collection<String>collection=new ArrayList<>();
        collection.add("Kuvempu");
        collection.add("K. S. Nissar Ahmed");
        collection.add("G. P. Rajarathnam");
        collection.add("A. K. Ramanujan");
        collection.add("Shishunala Sharif");
        System.out.println(collection);
        Collection<String>collection1=new ArrayList<>();
        collection1.add("P. V. Acharya");
        collection1.add("Annadanaiah Puranik");
        collection1.add("Basavanna");
        System.out.println(collection1);
        collection.addAll(collection1);
        collection.remove("Basavanna");
        //collection.clear();
        Iterator<String> itr=collection.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
