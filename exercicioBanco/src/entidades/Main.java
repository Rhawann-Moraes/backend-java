package entidades;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.abrirConta("CC");
		c1.setNumConta(1);
		c1.setDono("Rhawann Moraes de Carvalho");
		c1.depositar(300);
		c1.visualizar();
		c1.sacar(200);
		c1.visualizar();
		

	}

}
