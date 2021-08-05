
public class Caneta {
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	
	void rabiscar() {
		if (tampada) {
			System.out.println("Erro");
		} else {
			System.out.println("Rabiscando");
		}
	}
	
	void tampar() {
		tampada = true;
	}
	
	void destampar() {
		tampada = false;
	}
}
