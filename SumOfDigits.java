package sua;
import java.util.Scanner;
public class SumOfDigits {
	SumOfDigits(){
		
		System.out.print("Enter a value:\t");
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int i=0,sum=0;
		while(i<n) {
			sum=sum+i;
			i++;
		}
		System.out.println("The total value is::"+(sum));
    }
	public void display() {
		System.out.println("-----------------------****************************************-----------------------------");
		int a=40;
		int b=56;
		System.out.print("A="+(a));
		System.out.println("\nB="+(b));
		if(a>b) {
			System.out.println("A is Greater than B");
		}
		else {
			System.out.println("B is Greater than A");
		}
	}
	public void printOdd(){
		System.out.println("-----------------------****************************************-----------------------------");
		Scanner odd=new Scanner(System.in);
		System.out.println("Enter N:");
		int oddP=odd.nextInt();
		int i;
		System.out.println("Printing Odd Numbers");
		for(i=0;i<=oddP;i++) {
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
		
	}
	public static void main(String[] args) {
		SumOfDigits obj=new SumOfDigits();
		obj.display();
		obj.printOdd();
	}
}