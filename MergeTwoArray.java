import java.util.Arrays;
public class MergeTwoArray{
    public void mergeTwoArray(int[] arr1, int[] arr2, int[] arr3){
        // System.out.println(arr3.length);
        int i;
        for(i = 0; i <arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int j = 0; j<arr2.length; j++) {
            arr3[i++] = arr2[j];
        }
        for(int k = 0; k<arr3.length; k++){
             Arrays.sort(arr3);
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args){
        int[] lArr1 = {3, 2, 5};
        int[] lArr2 = {1, 4, 6};
        int[] lArr3 = new int[lArr1.length + lArr2.length];
        MergeTwoArray lObj = new MergeTwoArray();
        lObj.mergeTwoArray(lArr1, lArr2, lArr3);
    }
}