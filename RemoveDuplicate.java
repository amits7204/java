import java.util.Arrays;
public class RemoveDuplicate{
    public void removeDuplicateElement(int[] arr){
        int lRemoveDuplicateElem = 0;
        int[] lArray2 = new int[arr.length];
        for(int i= 0; i<arr.length; i++){
            Arrays.sort(arr);
            if(lArray2[lRemoveDuplicateElem] != arr[i]){
                 lArray2[lRemoveDuplicateElem] = arr[i];
                System.out.println(lArray2[lRemoveDuplicateElem]);
            }
        }
    }
    public static void main(String[] args){
        int[] lArray = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8,5,1,3};
        RemoveDuplicate lObj = new RemoveDuplicate();
        lObj.removeDuplicateElement(lArray);
        
    }
}