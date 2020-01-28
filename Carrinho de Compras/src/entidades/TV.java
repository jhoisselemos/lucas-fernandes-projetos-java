package entidades;

public class TV extends Eletronicos {

	public TV(String tipo, String nome, String fabricante, String tamanho, float preco, int codBarra) {
		super(tipo, nome, fabricante, tamanho, preco, codBarra);
		
	}

	public String toString() {
		return super.mostrar();
	}
}
