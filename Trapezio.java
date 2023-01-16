package figuras;

public class Trapezio extends FiguraGeometrica {

	float baseMaior, baseMenor, altura;
	
	float hipo = (float) Math.sqrt((Math.pow((baseMaior-baseMenor)/2 , 2) + Math.pow(altura,2)));
	
	public void calcularPerimetro() {
		
		perimetro = baseMaior + baseMenor + 2*hipo;
		return;	
	}

	public void calcularArea() {
		
		area = (baseMaior + baseMenor)*altura/2;
		return;
	}
	
	public void imprimir() {
		System.out.println("O perimetro do trapezio é: " + getPerimetro());
		System.out.println("A area do trapezio é: " + getArea());
	}
}

