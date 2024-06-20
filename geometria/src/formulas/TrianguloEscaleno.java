package formulas;

public class TrianguloEscaleno extends Triangulo {
	public TrianguloEscaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}
	
	@Override
    public double calcularAltura() {
        double area = calcularArea();
        return (2 * area) / lado1;  // Considerando lado1 como a base
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

}
