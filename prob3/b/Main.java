package lab3.prob3.b;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(14);
		System.out.println("Circle Area: " + circle.computeArea());
		
		Cylinder cylinder = new Cylinder(10, 100);
		System.out.println("Volume of cylinder: " + cylinder.computeVolume());
	}
}
