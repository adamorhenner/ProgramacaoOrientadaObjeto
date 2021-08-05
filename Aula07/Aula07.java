
public class Aula07 {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Adam", "Brasil", 23, 1.70f, 50.0f, 10, 0, 0);
		
		l[1] = new Lutador("Darth","Argentina", 55, 1.78f, 80.0f, 15, 15, 1);
		
		l[2] = new Lutador("Vader","EUA", 35, 1.65f, 80.9f, 12, 2 , 1);
		
		l[3] = new Lutador("Obiwan", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
		
		l[4] = new Lutador("Mario", "Japao", 37, 1.70f, 119.3f, 5, 4, 3);
		
		l[5] = new Lutador("Padawan", "Brasil", 20, 1.70f, 81.0f, 12, 0, 0);
		
		l[3].apresentar();
		l[3].status();
		
	}

}
