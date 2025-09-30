package farmacia.model;

public class Medicamento extends Produto{
	String generico;
	
	public Medicamento(int id, int tipo, float preco, String nome, String generico) {
		super(id, tipo, preco, nome);
		this.generico = generico;
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Generico: %s%n", this.generico);
	}
}
