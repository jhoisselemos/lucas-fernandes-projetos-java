package entidades;

public class SOM extends Eletronicos {

	public SOM(String tipo, String nome, String fabricante,  String tamanho, float preco,int codBarra) {
		super(tipo, nome, fabricante, tamanho, preco, codBarra);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return super.mostrar();
	}
}
