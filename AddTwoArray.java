public class AddTwoArray{
    public static void addTwoArray(int[] arr1, int[] arr2, int[] arr3){
        for(int i = 0; i<arr1.length; i++){
            arr3[i] = arr1[i]+arr2[i];
             System.out.println(arr3[i]);
        }

        // For Multiply
        System.out.println(" ");

        for(int j = 0; j<arr1.length; j++){
            arr3[j] = arr1[j] * arr2[j];
            System.out.println(arr3[j]);
        }
       
    }
    public static void main(String[] args){
        int[] lArr1 = {1, 2, 5, 7, 9};
        int[] lArr2 = {3, 5, 6, 8, 0};
        int[] lArr3 = new int[lArr1.length];

        addTwoArray(lArr1, lArr2, lArr3);
    }
}