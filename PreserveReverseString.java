public class PreserveReverseString{
	public void getString(String aString){
		System.out.println(aString);
		String[] lString = aString.split(" ");
		char lChar;
		
		for(String aStr : lString){
			for(int i = aStr.length()-1; i >=0; i--){
				lChar = aStr.charAt(i);
				System.out.print(lChar);
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args){
		PreserveReverseString lObj = new PreserveReverseString();
		lObj.getString("This is a Laptop");
	}
}