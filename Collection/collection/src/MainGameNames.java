import java.util.*;

public class MainGameNames {
    public static void main(String[] args) {
       // List<String>collection=new LinkedList<>();
       // Set<String >collection=new HashSet<>();
        Collection <String> collection=new ArrayList<>();
        collection.add("Red Dead Redemption" );
        collection.add(       "Minecraft");
        collection.add( "Grand Theft Auto V");
        collection.add(   "The Elder Scrolls V: Skyrim");
        System.out.println("the games are "+collection);
        Collection<String>collection1=new ArrayList<>();
        collection1.add(    "Fortnite");
        collection1.add(    "Dark Souls III");
        collection1.add(    "Overwatch");
        collection1.add(    "Super Mario Odyssey.");
        collection.remove("Minecraft");
        System.out.println("the second games are"+collection1);
        collection.addAll(collection1);
        //collection.clear();
        //collection.contains("Minecraft");
        //collection.removeAll(collection);
        Iterator<String> itr=collection.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
