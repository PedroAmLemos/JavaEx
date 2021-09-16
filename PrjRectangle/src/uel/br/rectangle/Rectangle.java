package uel.br.rectangle;

public class Rectangle {
	private double length = 1;
	private double width  = 1;

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length > 0 && length < 20) {
			this.length = length;
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
		if(length > 0 && width < 20) {
			this.width = width;
		}
	}
	
	public double calculaPerimetro() {
		double perimetro = this.length * 2 + this.width * 2;
		return perimetro;
	}
	
	public double calculaArea() {
		double area = this.length * this.width;
		return area;
	}

}
