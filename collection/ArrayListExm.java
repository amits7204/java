import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExm{
    
    public static ArrayList<String> mList = new ArrayList<>();
    public static String mString = "Traversing list through for each Method";
    public static void forEach(){
        mList.add("a");
        mList.add("m");
        mList.add("i");
        mList.add("t");
        /**
         * iterate by for-each loop
         */
      for(String s : mList){
          System.out.print(s);
      }  
    }

    /**
     * iterator the element by ListEterator interface
     */
    public static void listIterator(){
        ArrayList<String>lListIterator = new ArrayList<String>();
        lListIterator.add("hey");
        lListIterator.add("hii");
        lListIterator.add("hello");
        lListIterator.add("abc");
        System.out.println("\n iterator the element by ListEterator interface");
        ListIterator<String> lStoreList = lListIterator.listIterator(lListIterator.size());
        while(lStoreList.hasPrevious()){
            System.out.println(lStoreList.previous());
        }
    }

    public void forEachMethod(){
        ArrayList<String> lStringList = new ArrayList<String>();
        lStringList.add("String");
        lStringList.add("Array");
        lStringList.add("Int");
        lStringList.add("Float");
        System.out.println(mString);
        lStringList.forEach(a->{
            System.out.println(a);
        });
    }
    public static void main(String[] args){
    ArrayList<String> lList = new ArrayList<>();    
    lList.add("1");
    lList.add("2");
    lList.add("amit");
    lList.add("singh");
    /**
     * Iterate the element by Iterator interface
     */
        Iterator lIterator = lList.iterator();
        while(lIterator.hasNext()){
            System.out.println(lIterator.next());
        }
        forEach();
        listIterator();
        ArrayListExm lNew = new ArrayListExm();
        lNew.forEachMethod();
    }

   
}