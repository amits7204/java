
class Laptop{
	public void getLaptopName(){
		System.out.println("Macbook Pro");
	}
}

class Apple extends Laptop{
	public void getLaptopName(){
		System.out.println("Macbook Air");
	}
}

class Lenovo extends Laptop{
	public void getLaptopName(){
		System.out.println("Lenovo Thinkpad");
	}
}

public class UpcastingExample1{
	public static void main(String[] args){
		Laptop lObj = new Apple();
		lObj.getLaptopName();
		Laptop lObj1 = new Lenovo();
		lObj.getLaptopName();
	}
}