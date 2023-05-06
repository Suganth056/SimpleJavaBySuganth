package sua;
class Parents{
	void display() {
		System.out.println("Ennada panra");
	}
}
class Child extends Parents{
	void display() {
		super.display();
		System.out.println("Summatha iukey");
		super.display();
	}
	
}
public class TestOverride {
	int roll;
	String name;
	char initial;
	TestOverride(int roll,String name,char initial){
		this.roll=56;
		System.out.println("Roll="+roll+"\nName="+name+"  "+initial);
		
	}
	public static void main(String[] args) {
		TestOverride get=new TestOverride(54,"Suganth",'B');
		Child a=new Child();
		a.display();
}

}
