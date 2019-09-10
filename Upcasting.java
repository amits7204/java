public class Upcasting extends ParentClass{
	public void run(){
		System.out.println("Child class");
	}
public static void main(String[] args){
		ParentClass lObj = new Upcasting();  //Upcasting
		lObj.run();
	}
}

class ParentClass{
	public void run(){
		System.out.println("Parent class");
	}
}