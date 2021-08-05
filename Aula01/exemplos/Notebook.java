package exemplos;

public class Notebook {
	String modelo;
	String cor;
	int memoria;
	boolean power;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Memoria: " + this.memoria);
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public void jogar() {
		if (memoria < 8 ) {
			System.out.println("Pouca memoria para jogar");
		} else {
			System.out.println("Estamos Jogando");
		}
	}
	
	

}
