package formulas;

public class Main {
    public static void main(String[] args) {
        Triangulo equilatero = new TrianguloEquilatero(5);
        System.out.println("Triângulo Equilátero:");
        System.out.println("Altura: " + equilatero.calcularAltura());
        System.out.println("Perímetro: " + equilatero.calcularPerimetro());
        System.out.println("Área: " + equilatero.calcularArea());

        Triangulo escaleno = new TrianguloEscaleno(3, 4, 5);
        System.out.println("Triângulo Escaleno:");
        System.out.println("Altura: " + escaleno.calcularAltura());
        System.out.println("Perímetro: " + escaleno.calcularPerimetro());
        System.out.println("Área: " + escaleno.calcularArea());

        Triangulo isosceles = new TrianguloIsosceles(5, 8);
        System.out.println("Triângulo Isósceles:");
        System.out.println("Altura: " + isosceles.calcularAltura());
        System.out.println("Perímetro: " + isosceles.calcularPerimetro());
        System.out.println("Área: " + isosceles.calcularArea());
    }
}
