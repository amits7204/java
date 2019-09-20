public class SubArray{
	public int getSumValue(int aArray[], int aSum){
		int current_sum = aArray[0], start = 0;
		for (int i = 1;i <=aArray.length; i++) {
			while(current_sum > aSum && start < i-1){
				current_sum = current_sum - aArray[start];
				start++;
			}
			if(current_sum == aSum){
				int p = i - 1;
				System.out.println("("+start+", "+p+")");
				return 1;
			}
			if(i < aArray.length){
				current_sum = current_sum + aArray[i];
			}
		}
		return 0;
	}
	public static void main(String[] args){
		int arr[] = {10, 3, 5, 20, 15};
		int lSum = 28;
		SubArray lObj = new SubArray();
		lObj.getSumValue(arr, lSum);
	}
}