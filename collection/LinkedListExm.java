import java.util.Iterator;
import java.util.LinkedList;

 
public class LinkedListExm{
    public static void main(String[] args){
        LinkedList<String> lLinkedList = new LinkedList<>();
        lLinkedList.add("apple");
        lLinkedList.add("banana");
        lLinkedList.add("pineApple");
        lLinkedList.add("graphs");
/**
 * traverse data through simple for loop
 */
        for(int i = 0; i < lLinkedList.size(); i++){
            System.out.println(lLinkedList.get(i));
        }
/**
 * traverse data through iterator
 */
        Iterator<String> lIt = lLinkedList.iterator();
        System.out.println("traverse data through iterator");
        while (lIt.hasNext()) {
            System.out.println(lIt.next());
        }
    }
}