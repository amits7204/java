public class RemoveDuplicate{
    public void removeDuplicateElement(int[] arr){
        int lRemoveDuplicateElem = 0;
        for(int i= 0; i<arr.length; i++){
           
            if(lRemoveDuplicateElem != arr[i]){
                 lRemoveDuplicateElem = arr[i];
                System.out.println(lRemoveDuplicateElem);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Hello");
        int[] lArray = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8};
        RemoveDuplicate lObj = new RemoveDuplicate();
        lObj.removeDuplicateElement(lArray);
        
    }
}