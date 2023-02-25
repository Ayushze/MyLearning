package pack658;

interface Bicycle{
	int a = 45;
	void applyBrake(int decrement);
	void speedUp(int increament);
}
interface HornBicycle{
	void blowHornK3g();
	void blowHornmhp();
}
class AvonCycle implements Bicycle, HornBicycle{
	void blownHorn() {
		System.out.println("Pee Pee Poo Poo");
	}
	public void applyBrake(int decrement) {
		System.out.println("Applying Brakes");
	}
	public void speedUp(int increament) {
		System.out.println("Applying speedUp");
	}
	public void blowHornK3g() {
		System.out.println("Kabhi kushi kabhi hum pee pee pee pee");
	}
	public void blowHornmhp() {
		System.out.println("Main hoon naa po po po po");
	}
}
public class interf{
	public static void main(String[] args) {
//		Bicycle b = new Bicycle(); interfaces classes can't be instantiated
		AvonCycle cycle1 = new AvonCycle(); // you have to use implement class to create an object
		cycle1.applyBrake(1);
		System.out.println(Bicycle.a);
		System.out.println(cycle1.a);
		cycle1.blowHornK3g();
		cycle1.blowHornmhp();
	}
}