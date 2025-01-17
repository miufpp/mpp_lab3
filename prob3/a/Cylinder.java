package lab3.prob3.a;

public class Cylinder {
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return Math.PI * Math.pow(this.radius, 2)* this.height;
	}
}
