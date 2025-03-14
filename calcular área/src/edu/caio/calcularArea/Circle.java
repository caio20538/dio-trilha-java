package edu.caio.calcularArea;

public record Circle(double radius) implements GeometricArea{
	private static final double PI = 3.14;

	@Override
	public double getArea() {
		return PI * (radius * radius);
	} 
}
