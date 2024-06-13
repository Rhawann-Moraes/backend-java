package orientacaoaobjeto;

public abstract class Animal {
	protected String nome;
	protected String tamanho;
	protected int idade;
	protected String habitat;
	protected String sexo;
	
	//Construtor para inicializar os atributos
	public Animal( String nome, String tamanho, int idade, String habitat, String sexo) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.idade = idade;
		this.habitat = habitat;
		this.sexo = sexo;
	}
	// Metodos comuns
	 public void dormir() {
	        if (this.sexo.equalsIgnoreCase("M") || this.sexo.equalsIgnoreCase("Macho")) {
	            System.out.println("O " + nome + " está dormindo.");
	        } else {
	            System.out.println("A " + nome + " está dormindo.");
	        }
	    }
	//Metodos para implementar com a superclass
	 public abstract void comer();
	 public abstract void fazerSom();
	 
	//Gerar getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
