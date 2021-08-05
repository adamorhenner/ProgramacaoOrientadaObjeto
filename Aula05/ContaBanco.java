
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public void estadoAtual() {
		System.out.println("------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	
	public ContaBanco() {
		this.setSaldo (0);
		this.setStatus (false);
	}
		
	public void abriConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			saldo = 50;
		} else {
			if (tipo == "CP") {
				saldo = 150;
			}
		}
		System.out.println("Conta do(a)"+ getDono() + " aberta com sucessso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro, remova todo o saldo para fechar sua conta!");
		}else {
			if (this.getSaldo() < 0 ) {
				System.out.println("Conta com débito, pague suas dividas para fechar sua conta!");
			} else {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso!");
			}
		}
		
	}
	
	public void depositar(float valorDeposito ) {
		if (this.getStatus() == true) {
			this.setSaldo(getSaldo() + valorDeposito);		
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em conta fechado!");
		}
	}
	
	public void sacar (float valorSaque) {
		if (this.getStatus() == true) {
			if(this.getSaldo() >= valorSaque) {
				this.setSaldo(this.getSaldo() - valorSaque);
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossivel sacar, sua conta esta fechada!");
		}
		
	}
	
	public void pagarMensal() {
		float valorMensal = 0f;
		if (this.getTipo() == "CC") {
			valorMensal = 12;
		} else {
			if (this.getTipo() == "CP") {
				valorMensal = 20;
			} else {
				System.out.println("Digite um tipo de conta CC ou CP");
			}
		} if(this.getStatus() == true) { 
			if(this.getSaldo() > valorMensal) {
				this.setSaldo(this.getSaldo() - valorMensal);
				System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
			} else {
				System.out.println("Saldo insuficiente para pagamento mensal");
			}
		} else {
			System.out.println("Conta fechada, impossivel pagar");
		}
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
}
