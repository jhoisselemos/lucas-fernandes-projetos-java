package entidades;

public class Alimentos extends Produtos{


	// ATRIBUTOS
	public float peso;

	public Alimentos(String tipo, String nome, String fabricante, float preco, float peso, int codBarra) {
		super(tipo, nome, fabricante, preco, codBarra);
		
		this.peso = peso;
	
	}

	public String toString() {
		return super.ver();
	}
	
}
