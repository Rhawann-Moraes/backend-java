package formulas;

public class TrianguloEquilatero extends Triangulo {
	public TrianguloEquilatero(double lado) {
		super(lado, lado, lado);
	}
	@Override
	public double calcularAltura(){
		return (Math.sqrt(3)/2)*lado1;
	}
	@Override
    public double calcularPerimetro() {
        return 3 * lado1;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * (lado1 * lado1);
    }
	
}
