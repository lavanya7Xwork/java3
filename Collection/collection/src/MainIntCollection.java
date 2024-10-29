import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MainIntCollection {
    public static void main(String[] args) {
        Collection<Integer>collection=new ArrayList<>();
        collection.add(11);
        collection.add(67);
        collection.add(34);
        collection.add(1234);
        collection.add(86);
        collection.add(975);
        /*for(Integer integer:collection){
            if(integer %2!=0)
                System.out.println(integer);
        }*/
                            //OR

        List<Integer>collectionOfOddNumbers=collection.stream().filter(i->(i %2!=0)).collect(Collectors.toList());
        collectionOfOddNumbers.forEach(System.out::println);

    }
}
