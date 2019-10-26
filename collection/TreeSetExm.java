import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExm{
    public static void main(String[] args){
        TreeSet<String> lTs = new TreeSet<String>();
        lTs.add("Amit");
        lTs.add("Ravi");
        lTs.add("");
        lTs.add("Vivek");
        lTs.add("Anshul");
        lTs.add("Anshul");
        Iterator<String> lIs = lTs.iterator();
        while(lIs.hasNext()){
            System.out.println("Fetching data: "+lIs.next());
        }

        TreeSet<Integer> lInt = new TreeSet<>();
        lInt.add(2);
        lInt.add(1);
        lInt.add(99);
        lInt.add(66);
        Iterator<Integer> data = lInt.iterator();
        while(data.hasNext()){
             System.out.println(data.next());

        }
        System.out.println("Highest Value: "+lInt.pollFirst());
        System.out.println("Lowest Value: "+lInt.pollLast());
    }
}