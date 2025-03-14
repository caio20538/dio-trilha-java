package edu.caio.calcularArea;

public record Rectangle(double h, double base) implements GeometricArea{

	@Override
	public double getArea() {
		return h * base;
	}

}
