public class MultiDimentionalArray{
    public static void twoDarray(int[][] array1, int[][] array2, int[][] array3){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                array3[i][j] = array1[i][j] * array2[i][j];
                System.out.print(array3[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        int[][] lArray1 = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        int[][] lArray2 = {{3, 4, 5}, {6, 3, 9}, {2, 9, 1}};
        int[][] lArray3 = new int[lArray1.length][lArray2.length];
        twoDarray(lArray1, lArray2, lArray3);
    }
}