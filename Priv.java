package sua;
import java.util.Scanner;
 public class Priv {
	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner get=new Scanner(System.in);
		int n=arr.length;
		System.out.println(n+".....");
		System.out.println("Enter a nomber");
		for(int i=0;i<n;i++) {
			arr[i]=get.nextInt();
		}
		for(int i=0;i<n;) {
			System.out.println(arr[i]);
			i+=2;
		}
		
	}

}
