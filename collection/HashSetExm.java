import java.util.HashSet;
import java.util.Iterator;

public class HashSetExm{
    public static void main(String[] args){
        HashSet<String> lHs = new HashSet<>();
        lHs.add("One");
        lHs.add("Two");
        lHs.add("Three");
        lHs.add("Four");
        lHs.add("Five");
        lHs.add("Four");
        System.out.println("Initial Set of List: "+lHs);
        lHs.remove("Three");
        System.out.println("After Remove "+lHs);
        HashSet<String> lHs1 = new HashSet<>();
        lHs1.add("Amit");
        lHs1.addAll(lHs);
        System.out.println("Merge both hashSet Table: "+lHs1);
        Iterator<String> lIt = lHs.iterator();
        while(lIt.hasNext()){
            System.out.println(lIt.next());
        }
    }
}