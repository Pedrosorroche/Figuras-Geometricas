package figuras;

import java.lang.Math;

public class Circulo extends FiguraGeometrica {
	
	float raio;
	
	public void calcularPerimetro() {
		
		perimetro = (float) (2*Math.PI*raio);
		return;
	}
	
	public void calcularArea() {
		area = (float) (Math.PI*raio*raio);
		return;
	}

	public void imprimir() {
		System.out.println("O perimetro do circulo é: " + getPerimetro());
		System.out.println("A area do circulo é: " + getArea());
	}
}
