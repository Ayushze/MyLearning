package pac467;

interface MyCamera{
	void takeSnap();
	void recordVideo();
	private void greet() {
		System.out.println("Good Morning");
	}
	default void recordVideo4K() {
		greet();
		System.out.println("Record in 4K....");
	}
}

interface MyWiFi{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class MyCellPhone{
	void callNumber(int phoneNumber) {
		System.out.println("Calling "+phoneNumber);
	}
	void pickCall() {
		System.out.println("Connecting... ");
	}
}
class MySmartPhone extends MyCellPhone implements MyWiFi, MyCamera{
	public void takeSnap() {
		System.out.println("Taking Snap");
	}
	public void recordVideo() {
		System.out.println("Taking video");
	}
//	public void recordVideo4K() {
//		System.out.println("Taking snap and recording in 4k");
//	}
	public String[] getNetworks() {
		System.out.println("Getting list of Networks");
		String[] networkList = {"XYZ","XYZ1","XYZ2"};
		return networkList;
	}
	public void connectToNetwork(String network) {
		System.out.println("Connecting to "+network);
	}
}

public class MyMobileWiFiLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmartPhone ms = new MySmartPhone();
		ms.callNumber(4565457);
		ms.recordVideo4K();
		// ms.greet()--->throws an error
		String[] ar = ms.getNetworks();
		for(String items:ar) {
			System.out.println(items);
		}
	}

}
