import java.util.Scanner;
public class LinkedList{
Node head;
	static class Node{
		int mData;
		Node mNext;
		public Node(int aData){
			mData = aData;
			mNext = null;
		}
	}
	void printlist(){
		Node lNode = head;
		while(lNode != null){
			System.out.println(lNode.mData);
			lNode = lNode.mNext;
		}
	}
	public static void main(String[] args){
		
		Scanner lSc1 = new Scanner(System.in);
		int lData1 = lSc1.nextInt();
		Scanner lSc2 = new Scanner(System.in);
		int lData2 = lSc2.nextInt();
		Scanner lSc3 = new Scanner(System.in);
		int lData3 = lSc3.nextInt();
		LinkedList lLinkedListOBJ = new LinkedList();
		lLinkedListOBJ.head = new Node(lData1);
		Node lSecond = new Node(lData2);
		Node lthird = new Node(lData3);

		lLinkedListOBJ.head.mNext = lSecond;
		lSecond.mNext = lthird;
		lLinkedListOBJ.printlist();

	}

}