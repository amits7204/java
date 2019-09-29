import java.util.Scanner;
public class CheckPrimeNumber{
    public void checkPrimeNumber(int aInt){
        if(aInt%2==0){
            System.out.println(aInt+" is not primeNumber");
        }else
            System.out.println(aInt+" is a primeNumber");
    }
    public static void main(String[] args){
        CheckPrimeNumber lObj = new CheckPrimeNumber();
        Scanner lSc = new Scanner(System.in);
        int lPrimeno = lSc.nextInt();
        lObj.checkPrimeNumber(lPrimeno);
    }
}