public class Practise{
	boolean mIsBoolean = false;
	public void findPrimeNumber(int aInt){
		
		for(int i = 2; i <=aInt/2; i++){
			System.out.println(aInt);
			if(aInt%i==0){
				mIsBoolean = true;
				break;
			}
		}
		if(!mIsBoolean){
			System.out.println(aInt+" is prime number");
		}else{
			System.out.println(aInt+" is not prime number");
		}

	}

	public void findPrimeNumberWithinFactors(int aInt){
		for(int i = 1; i<=aInt; i++){
			if(aInt%i==0){
				System.out.println("Factors number is: "+i);
				for(int j = 1; j <=i/2; j++){
					if(i%j==0){
						System.out.println("PRIME NUMBER IS: "+j);
					}
				}
			}
			
		}

	}

	public void removeDuplicate(String aString){
		char lChar;
		for (int i = 0;i<aString.length(); i++) {
			lChar = aString.charAt(i);
		 	System.out.println(lChar);
		 } 
	}
	public static void main(String[] args){
		Practise lObj = new Practise();
		lObj.findPrimeNumber(15);
		// lObj.findPrimeNumberWithinFactors(28);
		lObj.removeDuplicate("Hello");
	}
}