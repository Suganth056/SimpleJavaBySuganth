package sua;
class A{
	void add() {
	   int c=5+5;
	   System.out.println(c);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	void add() {
		   int c=10+5;
		   System.out.println(c);
		}
		void add(int a,int b) {
			System.out.println(a+b);
		}
	}
public class OverbeOverrid {
	public static void main(String[] args) {
		A obj=new A();
		A obj1=new B();
		obj1.add();
		obj1.add(5, 40);
	}

}
