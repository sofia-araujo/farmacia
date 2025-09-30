package farmacia.model;

public abstract class Produto{
	int id;
	int tipo;
	float preco;
	String nome;
	
	public Produto(int id, int tipo, float preco, String nome) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.preco = preco;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {
			
		String tipo = " ";
				
		switch(this.tipo) {
			case 1 -> tipo = "Medicamento";
			case 2 -> tipo = "Cosmético";
			default -> tipo = "Inválido";
		}
				
		System.out.println("\n********************************************");
		System.out.println("Dados do Produto");
		System.out.println("********************************************");
		System.out.printf("Id do produto: %d%n", this.id);
		System.out.printf("Nome do produto: %s%n", this.nome);
		System.out.printf("Tipo do produto: %s%n", tipo);
		System.out.printf("Preço do produto: %.2f%n", this.preco);
	}
}
