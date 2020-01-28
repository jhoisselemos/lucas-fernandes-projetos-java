package entidades;

public class Carro{

	// Atributos
	private String marca;
	private String nome;
	private String cor;
	private String tipoMotor;
	private double potenciaMotor;
	private double quilometragem;

	public Carro(String marca, String nome, String cor, String tipoMotor, double potenciaMotor, double quilometragem){
		this.marca = marca;
		this.nome = nome;
		this.cor = cor;
		this.tipoMotor = tipoMotor;
		this.potenciaMotor = potenciaMotor;
		this.quilometragem = quilometragem;
	}

	public String getmarca(){
		return marca;
	}
	public void setmarca(String marca){
		this.marca = marca;
	}

	public String getnome(){
		return nome;
	}
	public void setnome(String nome){
		this.nome = nome;
	}

	public String getcor(){
		return cor;
	}
	public void setcor(String cor){
		this.cor = cor;
	}

	public String gettipoMotor(){
		return tipoMotor;
	}
	public void settipoMotor(String tipoMotor){
		this.tipoMotor = tipoMotor;
	}

	public double getpotenciaMotor(){
		return potenciaMotor;
	}
	public void setpotenciaMotor(double potenciaMotor){
		this.potenciaMotor = potenciaMotor;
	}

	public double getquilometragem(){
		return quilometragem;
	}
	public void setquilometragem(double quilometragem){
		this.quilometragem = quilometragem;
	}
	
	// -> Metodo de Exibição <- 
	public void vercarro(){
		System.out.println( "Marca: " + this.getmarca() + 
							"| Nome: " + this.getnome() + 
							"| Cor: " + this.getcor() + 
							"| Tipo do Motor: " + this.gettipoMotor() + 
							"| Potência do Motor: " + this.getpotenciaMotor() +
							"| Quilometragem: " + this.getquilometragem() + "00"+" km rodados"
						  );
	}
}