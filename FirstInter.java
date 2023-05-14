package forInterface;
interface C{
	
}
interface A extends C{
	final static int x=10;
	public abstract void m1();
}
class B implements A{
	int x=20;
	public void m1() {
		System.out.println("java");
	}
}
public class FirstInter {
	public static void main(String[] args) {
		A a=new B();//here the reference of object created for A so 
		a.m1();
		System.out.println(a.x);//final variable X can't be changed
	}

}
