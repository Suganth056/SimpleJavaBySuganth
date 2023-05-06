package sua;
import java.util.Scanner;
public class New {
	void add(Scanner sc,int add){
		String choice;
		int n;
		//System.out.println("Enter a number:");
		//add=sc.nextInt();
		
		//choice=sc.nextLine();
		int initial=1;
		choice="o";
		while((choice=="+")||(initial==1)) {
			if(choice=="+") {
				n=sc.nextInt();
				add+=n;
			}
			choice=sc.nextLine();
			initial=0;
		}
		System.out.println("Value="+add);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		New obj=new New();
		int add=0;
		obj.add(sc,add);
	}

}
