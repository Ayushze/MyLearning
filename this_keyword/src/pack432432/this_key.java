package pack432432;

class A{
	int i;
	void setValue(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(i);
	}
}

public class this_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o = new A();
		o.setValue(100);
		o.show();
	}
}
