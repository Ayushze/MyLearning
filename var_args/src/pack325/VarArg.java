package pack325;

class VarArg {
	
	static int m1(int...arr){
		int sum = 0;
		for(int e:arr) {
			sum = sum +e;
		}
		return sum;
	}
	
	static int m2(int x, int...arr1){
		int sum1 = x;
		for(int e:arr1) {
			sum1 = sum1 +e;
		}
		return sum1;
	}
	
	public static void main(String[] args) {
		System.out.println(m1(2,3,4,5,6,2)); //int a1=2, int a2=3, int a3=4.....
		System.out.println(m2(2,4,6,7,3,3)); //int x =2, int a1=4, int a2=6.....
	}
}