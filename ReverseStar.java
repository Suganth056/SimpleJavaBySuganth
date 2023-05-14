package threadapplication;

public class ReverseStar {
	public static void main(String[] args) {
		int i,j,k,u=1;
		for(i=0;i<5;i++) {
			for(j=(5-1);j>i;j--) {
				System.out.print(" ");
			}
			for(k=0;k<u;k++) {
				System.out.print("*");
			}
			u++;
			System.out.println();
		}
	}

}
