package entidades;

public class Funcionario {
	private String nome;
	private double salarioBruto;
	private double imposto;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double taxa) {
		this.imposto = taxa;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void calcularAumento(double porcentagem) {
		salarioBruto +=  salarioBruto * porcentagem /100.0;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
		}
	
}
