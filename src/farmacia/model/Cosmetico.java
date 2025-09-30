package farmacia.model;

public class Cosmetico extends Produto{
	String fragancia;
	
	public Cosmetico(int id, int tipo, float preco, String nome, String fragancia) {
		super(id, tipo, preco, nome);
		this.fragancia = fragancia;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Fragância: %s%n", this.fragancia);
	}
}
