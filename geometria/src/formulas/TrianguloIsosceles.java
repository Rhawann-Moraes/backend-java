package formulas;

public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(double lado, double base) {
        super(lado, lado, base);
    }

    @Override
    public double calcularAltura() {
        // Altura de um triângulo isósceles
        return Math.sqrt((lado1 * lado1) - ((lado3 * lado3) / 4));
    }

    @Override
    public double calcularPerimetro() {
        return 2 * lado1 + lado3;
    }

    @Override
    public double calcularArea() {
        // Área de um triângulo isósceles
        return (lado3 * calcularAltura()) / 2;
    }
}

