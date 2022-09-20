package Document;

public class Rectangle extends Quardrilateral {
	public Rectangle(int length ,int bredth) {
		super(length);
		this.bredth = bredth;
	}
	public Rectangle(int length) {
		super(length);
	}
	int area() {
		int a =length*bredth;
		System.out.println("area of rectangle is" +a);
	return a;
	}
	int bredth;
	
}

	



	