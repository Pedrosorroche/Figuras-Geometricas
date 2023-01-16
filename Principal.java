package figuras;

public class Principal {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		c1.raio = 1.50f;
		c1.calcularPerimetro();
		c1.calcularArea();
		c1.imprimir();

		Quadrado q1 = new Quadrado();
		q1.lado = 2.0f;
		q1.calcularPerimetro();
		q1.calcularArea();
		q1.imprimir();
		
		Retangulo r1 = new Retangulo();
		r1.base = 4.0f;
		r1.altura = 6.0f;
		r1.calcularArea();
		r1.calcularPerimetro();
		r1.imprimir();
		
		TrianguloRetangulo t1 = new TrianguloRetangulo();
		t1.l1 = 3.5f;
		t1.l2 = 2.7f;
		t1.calcularPerimetro();
		t1.calcularArea();
		t1.imprimir();
		
		Trapezio tr1 = new Trapezio();
		tr1.baseMenor = 2.5f;
		tr1.baseMenor = 5.5f;
		tr1.altura = 3.7f;
		tr1.calcularPerimetro();
		tr1.calcularArea();
		tr1.imprimir();
		
		
		
	}

}
