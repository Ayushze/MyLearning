package packr45t43;

class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<34) {
			System.out.println("Thread 1");
			i++;
		}
	}
}

class B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<34) {
			System.out.println("Thread 2");
			i++;
		}
	}
}

public class runthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A t1 = new A();
		Thread a = new Thread(t1);
		B t2 = new B();
		Thread b = new Thread(t2);
		
		a.start();
		b.start();
	}
}
