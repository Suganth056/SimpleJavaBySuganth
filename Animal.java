package sua;
class Dog{
	public void name() {
		
	}
	public void colour() {
		
	}
	public void sense() {
		
	}
}
class Labrador extends Dog{
    public void name() {
	    System.out.println("The name of the dog was \"Labrador\"");
	}
	public void colour() {
		System.out.println("The colour of labrador was white");
	}
	public void sense() {
		System.out.println("Active sense");
	}
}

public class Animal {
	public static void main(String[] args) {
		Dog put=new Labrador();
		put.name();
		put.colour();
		put.sense();
		
	}

}
