package Aula12;

public class Aula12 {
	public static void main(String[] args) {
		//Animal n = new Animal();   <---- da erro pq animal é uma classe abstrata logo nao pode ser instanciada
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru jack = new Canguru();
		Cachorro spike = new Cachorro();
		Cobra c = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish nemo = new GoldFish();
		Arara arara = new Arara();
		
		System.out.println("==== mamifero =====");
		m.setPeso(35.4f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println("===== ave =====");
		a.locomover();
		System.out.println("==== canguru =====");
		jack.locomover();
		System.out.println("==== cachorro ====");
		spike.locomover();
		spike.emitirSom();
	}
}
