import java.util.*;

public class MapExm1{
    public static void main(String[] args){
        Map<Integer, String> lMap = new HashMap<>();
        lMap.put(1, "Delhi");
        lMap.put(2, "Mumbai");
        lMap.put(3, "Kolkata");
        lMap.put(4, "Chennai");
        for(Map.Entry m : lMap.entrySet()){
            System.out.println(m.getKey()+ " " +m.getValue());
        }
    }
}