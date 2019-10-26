import java.util.Iterator;
import java.util.PriorityQueue;

public class PriortyQueueExm{
    public static void main(String[] args){
        PriorityQueue<String> lPq = new PriorityQueue<String>();
        lPq.add("Amit");
        lPq.add("Ajit");
        lPq.add("Arijit");
        lPq.add("Girl");
        lPq.add("Boy");
        
       
        System.out.println("Head: "+lPq.element());
        System.out.println("Head: "+lPq.peek());
        System.out.println("Iterating queue: ");
        Iterator lIterator= lPq.iterator();
        while(lIterator.hasNext()){
            System.out.println(lIterator.next());
        }
    }
}