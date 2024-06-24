package entidades;

public class Conta {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public Conta() {
		this.setSaldo (0.0f); 
		this.setStatus(false);
	}
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void visualizar() {
		System.out.println("--------------------------------");
		System.out.println("Número da Conta: " + numConta);
		System.out.println("Tipo de Conta: " + tipo);
		System.out.println("Dono da Conta: " + dono);
		System.out.println("Saldo da Conta: " + saldo);
		System.out.println("Status da conta: " + status);
		System.out.println("--------------------------------");
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC") {
			this.setSaldo(50.0f);
			System.out.println("Conta criada com sucesso!");
		}else {
			this.setSaldo(150.0f);
			System.out.println("Conta criada com sucesso!");
		}
	}
	public void fecharConta() {
		if (getSaldo() > 0) {
			System.err.println("A conta não pode ser fechada");
		}else if (getSaldo() < 0){
			System.err.println("Você fechou sua conta");
		}else {
			setStatus(false);
		}
		
	}
	public void depositar(float v) {
		if(this.getStatus()) {
			this.setSaldo(getSaldo() + v);
			System.out.println(getDono()+ " recebeu um depósito de " + v + "R$ em sua conta!");
		}else {
			System.err.println("É necessário que exista uma conta ativa para realizar essa operação!");
		}
		
	}
	public void sacar(float v) {
		if(this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(getSaldo() - v);
				System.out.println(getDono()+ " realizou um saque de " + v + "R$ em sua conta!");
			}else {
				System.err.println("Saldo insuficiente para saque!");
			}
		}else {
			System.err.println("É necessário que exista uma conta ativa para realizar essa operação!");
		}
	}
	public void pagarMensalidade() {
		int v;
		if(getTipo() == "CC") {
			v = 12;
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Você pagou a mensalidade da conta " + getDono());
		}else if(getTipo() == "CP") {
			v = 20;
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Você pagou a mensalidade da conta " + getDono());
		}else {
			System.err.println("É necessário que exista uma conta ativa para realizar essa operação!");
		}
	}
}
