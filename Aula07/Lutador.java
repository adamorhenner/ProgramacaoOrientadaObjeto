
public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura,float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.setPeso(peso);
		
	}
	
	
	
	public void apresentar() {
		System.out.println("---------------------------------------");
		System.out.println("CHEGOU A HORA! de apresentamos o lutador " + this.getNome());
		System.out.println("diretamente de " + this.getNacionalidade());
		System.out.println("com "  +  this.getIdade() + " anos e " + this.getAltura() + "m de altura ");
		System.out.println("pesando " + this.getPeso() + "kg");
		System.out.println("Ganhou: " + this.getVitorias() + " vezes ");
		System.out.println("Perdeu: " + this.getDerrotas() + " vezes ");
		System.out.println("Empatou: " + this.getEmpates() + " vezes ");
	}
	
	public void status() {
		System.out.println("--------------------------------------");
		System.out.println(getNome());
		System.out.println("? um peso " + getCategoria());
		System.out.println(getVitorias() + " Vitorias");
		System.out.println(getDerrotas() + " Derrotas");
		System.out.println(getEmpates() + " Empates");	
	}
	
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() +1); 
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() +1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	private void setCategoria() {
		if (this.peso < 52.2f) {
			this.categoria = "Invalido";
		} else {
			if (this.peso <= 70.3f) {
				this.categoria = "Leve";
			} else {
				if (this.peso <= 83.9f) {
					this.categoria = "M?dio";
				} else {
					if (this.peso <= 120.2) {
						this.categoria = "Pesado";
					} else {
						this.categoria = "Invalido";
					}
				}
			}
		}
	}
	public String getCategoria() {
		return categoria;
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
