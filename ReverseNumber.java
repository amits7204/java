public class ReverseNumber{
	public void getReverseNumber(int[] aInt){
		for(int i = aInt.length-1; i >=0; i--){
			System.out.println(aInt[i]);
		}

	}
	public static void main(String[] args){
		ReverseNumber lObj = new ReverseNumber();
		int[] arr = {1,2,3,4,5,6,7,78,9,10};
		lObj.getReverseNumber(arr);
	}
}