package sua;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=10;
		int nextTerm,i;
		System.out.println(a);
		System.out.println(b);
		for(i=0;i<=n;i++) {
			nextTerm=a+b;
			System.out.println(nextTerm);
			a=b;
			b=nextTerm;
		}
		
	}

}
