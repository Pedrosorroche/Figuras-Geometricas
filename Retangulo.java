package figuras;

public class Retangulo extends FiguraGeometrica {

	float base, altura;
	
	public void calcularPerimetro() {
		
		perimetro = 2*base + 2*altura;
		return;
	}
	
	public void calcularArea() {
		area = base*altura;
		return;
	}
	
	public void imprimir() {
		System.out.println("O perimetro do retangulo é: " + getPerimetro());
		System.out.println("A area do retangulo é: " + getArea());
	}
}
