package ObjPass;

class point{
	private int x;
	private int y;
	
	public point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public double findDistance(point p2) {
		double d = Math.sqrt(Math.pow((p2.x-this.x),2)+Math.pow((p2.y-this.y),2));
		return d;
	}
}

class ObjPass{
	public static void main(String[] args) {
		point p1 = new point(3,8);
		point p2 = new point(80,21);
		System.out.println(p1.findDistance(p2));
	}
}