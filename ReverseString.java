public class ReverseString{
	public void getReverseString(String aString){
		String[] lString = aString.split(" ");
		for(int i = lString.length-1; i >= 0; i--){
			System.out.println(lString[i]);
		}


	}
	public static void main(String[] args){
		ReverseString lObj = new ReverseString();
		lObj.getReverseString("Hey developers can you make a one app");
	}
}