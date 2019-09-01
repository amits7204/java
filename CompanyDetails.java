class Company{
	int mEid;
	String mName;
    String mCompany = "Juspay";

	public Company(int aEid,  String aName){
		mEid = aEid;
		mName = aName;
	}

	public void display(){
		System.out.println(mEid+ " "+mName+ " "+mCompany);
	}
}

public class CompanyDetails{
	public static void main (String[] args){
		Company lCompanyObj = new Company(1, "Amit SIngh");
		Company lCompanyObj1 = new Company(2, "Rahul Singh");

		lCompanyObj.display();
		lCompanyObj1.display();
	}
}