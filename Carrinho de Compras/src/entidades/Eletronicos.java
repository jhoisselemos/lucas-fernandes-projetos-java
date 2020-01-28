package entidades;

 public abstract class Eletronicos extends Produtos{

	private String tamanho;
	private boolean ligado;
	private boolean desligado;
	
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
		
	}
	
	
	public Eletronicos(String tipo, String cor, String fabricante, String tamanho, float preco, int codBarra) {
		super(tipo, cor, fabricante, preco, codBarra);
		this.tamanho = tamanho;
	}
	
	public String mostrar() {
		return super.ver() + tamanho;
	}
	
	// EXIBIÇÃO
	public String ver() {
			return "Produtos Tipo" + tipo + ", Modelo=" + nome + ", Fabricante=" + fabricante + ",Tamanho=" + tamanho  + ",Preço=" + preco
					+ ", Código de Barra=" + codBarra;
		}
	
}
