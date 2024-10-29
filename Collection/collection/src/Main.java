import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Collection<String> collection= new ArrayList();
        collection.add("tint");
        collection.add("orange");
        System.out.println(collection);

        Collection<String> collection1= new ArrayList();
        collection1.add("pink");
        collection1.add("black");
        //collection.addAll(collection1);
        //collection.clear();
       //collection.remove("pink");
       // collection.removeAll(collection1);

        //System.out.println(collection.size());
        //we can use this type also to print the data
        for(String st:collection){
           System.out.println(st);
        }
        //retrive the object from collection

       // Iterator<String>itr=collection.iterator();
        //while(itr.hasNext()){
        //    System.out.println(itr.next());
        //}
    }
}