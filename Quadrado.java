package figuras;

public class Quadrado extends FiguraGeometrica {

	float lado;
	
	public void calcularPerimetro() {
		
		perimetro = 4*lado;
		return;
	}
	
	public void calcularArea() {
		
		area = lado*lado;
		return;
	}
	
	public void imprimir() {
		System.out.println("O perimetro do quadrado é: " + getPerimetro());
		System.out.println("A area do quadrado é: " + getArea());
		
	}
	
	
}
