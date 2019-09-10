public class ThisExample2{
	public void ad(ThisExample2 0bj){
		System.out.println("Invoke this method");
	}
	void display(){
		ad(this);
	}
	public static void main(String[] args){
		ThisExample2 lObj = new ThisExample2();
		lObj.display();
	}
}