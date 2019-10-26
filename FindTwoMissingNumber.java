public class FindTwoMissingNumber{
    public static void findTwoMissingNumber(int[] array){
        boolean[] lMark = new boolean[array.length+7];
        for(int i = 0; i < array.length; i++)
            lMark[array[i]] = true;

        System.out.println("missing number are: ");
        for(int i = 1; i <= array.length+6; i++)
            if(!lMark[i])
                System.out.println(i+" ");
        
        // System.out.println();
    }
    public static void main(String[] args){
        int[] lArray = {1, 8};
        findTwoMissingNumber(lArray);
    }
}