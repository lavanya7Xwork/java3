import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainMountains {
    public static void main(String[] args) {
        Collection<String >collection=new ArrayList<>();
        collection.add("Mount Everest");
        collection.add("Kangchenjunga");
        collection.add("Lhotse");
        collection.add("K2");
        collection.add("Makalu");
        Collection<String >collection1=new ArrayList<>();
        collection1.add("Cho Oyu");
        collection1.add("Annapurna");
        collection.add("Aconcagua");
        collection.add("Denali");
        collection.addAll(collection1);
        collection.remove("Denali");
        //collection.contains("Aconcagua");
        //collection.clear();
        Iterator <String> itr=collection.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
