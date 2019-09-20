public class StringExm{
	public void smallTocaps(String aString){
		for(int i = 0; i<aString.length(); i++){
			char lChar = aString.charAt(i);
			
			if(lChar >= 65 && lChar <= 90){
				char lc = (char)((lChar + 32));
				System.out.print(lc);
			}
			else
				System.out.print(lChar);
			}
			System.out.println();
		}
	public void swapValue(int n, int m){
		int p = m;
		m = n;
		n = p;
		System.out.println("(m = "+m+", n = "+n+")");
	}
	public void swapValueWithoutTemp(int a, int b){
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("(b = "+b+", a = "+a+")");
	}
	public void findFactorial(int aValue){
		int lValue = 0;
		for (int i = 1; i <=aValue; i++){
			lValue = i * aValue;
		}
		System.out.println(lValue);
	}

	public void findLargestNumber(int[] aNumber){
		int lLargestNumber = aNumber[0];
		for (int i = 0;i<aNumber.length; i++) {
			if(aNumber[i]>=lLargestNumber){
				lLargestNumber = aNumber[i];
				System.out.println("LargeNumber"+lLargestNumber);
			}else{
				System.out.println("Smallest: "+lLargestNumber);
			}
		}

	}
	public void findFactor(int n){
		for(int i = 1; i <= n; i++){
			System.out.println("Factor is: "+i+" ");
			for(int j = 1; j <= i; j++){
				if(i%j==0){
					System.out.println(j);
				}
			}
		}
	}
	public static void main(String[] args){
		StringExm lObj = new StringExm();
		int[] lArr = {30, 5, 89, 20, 5, 0, 1};
		lObj.smallTocaps("AMit SIngh");
		lObj.swapValue(20, 10);
		lObj.swapValueWithoutTemp(30, 40);
		lObj.findFactorial(5);
		lObj.findLargestNumber(lArr);
		// lObj.findFactor(100);

	}
}