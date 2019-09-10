//this: to invoke current class method
public class ThisExample1{
	public void a(){
		System.out.println("Call a Method");
	}
	public void b(){
		System.out.println("Call b method");
		this.a();
	}
	public static void main(String[] args){
		ThisExample1 lObj = new ThisExample1();
		lObj.b();
	}
}