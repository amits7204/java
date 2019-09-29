import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExam1{
    public static void main(String[] args){
        Student lStudent1 = new Student("a", 57, 27);
        Student lStudent2 = new Student("b", 88, 35);
        Student lStudent3 = new Student("c", 90, 45);
        ArrayList<Student> lList = new ArrayList<>();
        lList.add(lStudent1);
        lList.add(lStudent2);
        lList.add(lStudent3);
        Iterator lIterator = lList.iterator();
        while(lIterator.hasNext()){
            Student s = (Student)lIterator.next();
            System.out.println(s.name+ " "+s.rollno+ " "+s.age);
        }
    }
}