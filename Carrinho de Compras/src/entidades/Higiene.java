package entidades;

public class Higiene extends Produtos{

	// ATRIBUTOS
	

	private float peso;

	public Higiene(String tipo, String nome, String fabricante, float preco, float peso, int codBarra) {
		super(tipo, nome, fabricante, preco, codBarra);
		this.peso = peso;
		
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	public String toString() {
		return super.ver() + peso;
	}

	
	

}
