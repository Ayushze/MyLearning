package packq35346;

class thread1 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<56) {
			System.out.println("Hello1");
			i++;
		}
	}
}
class thread2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<56) {
			System.out.println("Hello2");
			i++;
		}
	}
}
public class Main1{
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		t1.start();
		t2.start();
	}
}