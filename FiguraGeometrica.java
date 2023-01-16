package figuras;

abstract class FiguraGeometrica {

	float area, perimetro;
	
	abstract public void calcularArea() {
		
	}
	
	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	abstract public void calcularPerimetro() {
		
	}
	
}
