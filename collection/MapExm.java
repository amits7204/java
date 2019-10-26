import java.util.*;

public class MapExm {
    public static void main(String[] args){
        Map lMap = new HashMap();
        lMap.put(1, "Amit");
        lMap.put(2, "Ajit");
        lMap.put(3, "rahul");
        lMap.put(4, "Amit");

        Set lSet  = lMap.entrySet();
        Iterator lIterator = lSet.iterator();
        while(lIterator.hasNext()){
            Map.Entry lEntry = (Map.Entry)lIterator.next();
            System.out.println(lEntry.getKey()+ " "+lEntry.getValue());
        }
        
        
    }
}