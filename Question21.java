package sua;
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School obj=new School();
		Student obj1=new Student();
		obj.print();
		obj1.print();
		String s="as";
		String t=" ";
		String d="er";
		System.out.print(s+t+d);
		
	}

}
