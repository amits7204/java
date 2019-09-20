public class ReverseInteger{
	public static void main(String[] args){
		int lNum = 1234, lReversed = 0;
		while(lNum != 0){
			int lDigit = lNum % 10;
			System.out.println("Digit Value is: "+lDigit);
			lReversed = lReversed * 10 + lDigit;
			System.out.println("Reversed Number is: "+lReversed);
			lNum /= 10;
			System.out.println("Number is: "+lNum);
		}
		System.out.println("Reverse Number is: "+lReversed);
	}
}