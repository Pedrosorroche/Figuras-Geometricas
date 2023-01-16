package figuras;

public class TrianguloRetangulo extends FiguraGeometrica {

	float l1, l2;
	
	float hipo = (float) Math.sqrt(l1*l1+l2*l2);
	
	public void calcularPerimetro() {
		
		perimetro = l1 + l2 +hipo;
		return;
	}
	
	public void calcularArea() {
		area = l1*l2/2;
		return;
	}
	
	public void imprimir() {
		
		System.out.println("O perimetro do triangulo é: " + getPerimetro());
		System.out.println("A area do triangulo é: " + getArea());
	}
}
