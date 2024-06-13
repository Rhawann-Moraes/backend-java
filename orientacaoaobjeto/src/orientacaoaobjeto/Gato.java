package orientacaoaobjeto;

public class Gato extends Animal{
	public Gato(String nome, String tamanho, int idade, String habitat, String sexo) {
		super(nome, tamanho, idade, habitat, sexo);
	}
	
	@Override
	public void comer() {
		System.out.println(nome + " está comendo peixe");
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Miau Miau!");
	}
}
