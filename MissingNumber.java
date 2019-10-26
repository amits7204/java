public class MissingNumber{
    public static void getMisNumber(int[] array){
        int lMissingNumber;
    
        int n=array.length+1;
        lMissingNumber = n*(n+1)/2;
        for(int i = 0; i < array.length; i++){
           lMissingNumber -= array[i];
           System.out.println(lMissingNumber);
        }
       
    }
    public static void main(String[] args){
        int[] lArray = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        getMisNumber(lArray);
    }
}