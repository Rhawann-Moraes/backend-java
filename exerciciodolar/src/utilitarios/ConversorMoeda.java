package utilitarios;

public class ConversorMoeda {
	public static final double IOF = 0.06;
	
	public static double calcularTaxa( double valorDolar) {
		return valorDolar * IOF;
	}
	
	public static double converter(double valorDolar, double cotacaoDolar ) {
		 double taxa = calcularTaxa(valorDolar);
	     double valorTotalDolar = valorDolar + taxa;
	     return valorTotalDolar * cotacaoDolar;
	}
}
