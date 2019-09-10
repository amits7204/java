public class ThisExample{
	int rollno;
	String name;
	float fee;

	public ThisExample(int rollno, String name, float fee){
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display(){
		System.out.println(rollno+", "+name+", "+fee);
	}
	public static void main(String[] args){
		ThisExample lTeObj = new ThisExample(1, "Amit Singh", 200f);
		lTeObj.display();
	}
}