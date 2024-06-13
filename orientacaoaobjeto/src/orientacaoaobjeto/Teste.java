package orientacaoaobjeto;

public class Teste {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Hulk", "Médio", 1, "Doméstico", "Macho" );
		
		cachorro1.comer();
		cachorro1.fazerSom();
		cachorro1.dormir();
		
		Gato gato1 = new Gato("The zex", "Médio", 1, "Doméstico", "femea" );
		
		gato1.comer();
		gato1.fazerSom();
		gato1.dormir();

	}
	

}
