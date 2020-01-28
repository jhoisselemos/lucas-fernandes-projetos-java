package entidades;

abstract public class Produtos {

	// ATRIBUTOS
	protected String tipo;
	protected String nome;
	protected String fabricante;
	protected float preco;
	protected int codBarra;
	
	// METODOS
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(int codBarra) {
		this.codBarra = codBarra;
	}
	
	// CONSTRUTOR
	public Produtos(String tipo, String nome, String fabricante, float preco, int codBarra) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
		this.codBarra = codBarra;
	}
	
	// EXIBIÇÃO
	public String ver() {
		return "Produtos Tipo" + tipo + ", Modelo=" + nome + ", Fabricante=" + fabricante + "Preço=" + preco
				+ ", Código de Barra=" + codBarra;
	}
	
}