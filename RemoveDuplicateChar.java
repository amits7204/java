public class RemoveDuplicateChar{
    public void removeDuplicateChar(String aString){
        String lString = "";
        for(int i = 0; i < aString.length(); i++){
            if(!lString.contains(String.valueOf(aString.charAt(i)))){
                lString += String.valueOf(aString.charAt(i));
            }
        }
        System.out.println(lString);
    }
    public static void main(String[] args){
        RemoveDuplicateChar lObj = new RemoveDuplicateChar();
        lObj.removeDuplicateChar("AAMMITM");
    }   
}