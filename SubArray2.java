import java.util.Scanner;

public class SubArray2{
    public static int getSubsumArray(int[] array, int aSum){
        int sumValue = array[0], start = 0;
        for(int i = 1; i<array.length; i++){
            while(sumValue > aSum ){
                sumValue = sumValue - array[start];
                start++;
            }
            if(sumValue == aSum){
                int p = i - 1;
                System.out.println(start+ " " +p);
                return 1;
            }
            if(i<array.length){
                sumValue = sumValue + array[i];
                // System.out.println(sumValue);
            }
           
           
        }
        System.out.println("No subarray Found");
        return 0;
        
    }
    public static void main(String[] args){
        int[] lArray = {10, 20, 3, 9, 34, 8};
        Scanner lSc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int lSum = lSc.nextInt();
        lSc.close();
        getSubsumArray(lArray, lSum);
    }
}