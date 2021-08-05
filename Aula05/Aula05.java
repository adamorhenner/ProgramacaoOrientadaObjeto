
public class Aula05 {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Estenio");
		p1.estadoAtual();
		p1.abriConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Maria");
		p2.abriConta("CP");
		
		p1.depositar(100f);
		p1.depositar(500f);
		p2.sacar(100f);
		
		p1.sacar(150f);
		p1.fecharConta();
		
		p1.estadoAtual();
		p1.estadoAtual();
		
	}
}
