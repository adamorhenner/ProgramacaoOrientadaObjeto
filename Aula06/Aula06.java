
public class Aula06 {
	public static void main(String[] args) {
		ControleRemoto lg = new ControleRemoto();
		lg.abrirMenu();
		lg.ligar();
		lg.pause();
		
		lg.play();
		lg.abrirMenu();
		
		lg.maisVolume();
		lg.maisVolume();
		lg.abrirMenu();
		
		lg.ligarMudo();
		lg.abrirMenu();
		
	}
}
