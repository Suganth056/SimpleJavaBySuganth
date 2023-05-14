package sua;

public class CurrenThreadDemo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current thread:"+t);
		t.setName("MyThread");
		System.out.println("After name Change :"+t);
		try {
			for(int n=5;n>0;n--) {
				System.out.println(n);
				Thread.sleep(400);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Current thread:"+t);
		}
	}

}
