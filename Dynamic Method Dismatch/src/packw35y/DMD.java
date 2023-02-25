package packw35y;

class phone {
	public void call() {
		System.out.println("Hello");
	}
	public void on() {
		System.out.println("Phone is on..");
	}
}
class smartPhone extends phone{
	public void movie() {
		System.out.println("Music is playing");
	}
	public void on() {
		System.out.println("Smart-Phone is on..");
	}
}

public class DMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p = new smartPhone();
		p.on(); // it is allowed and will take smart-phone value
		p.call(); //it is allowed
//		p.movie();  it is not allowed
	}
}
