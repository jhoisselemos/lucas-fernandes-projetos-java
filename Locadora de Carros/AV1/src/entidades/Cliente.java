package entidades;

import entidades.Carro;

public class Cliente {

	private String nome;
	private String endere�o;
	private String cpf;
	private String rg;
	private String dataAluguel;
	private String dataDevolu��o;
	private Carro carros;
	private int telefone;
	private int idade;

	public Cliente() {}
	
	public Cliente(String nome, String endere�o, String cpf, String rg, String dataAluguel, String dataDevolu��o, int telefone, int idade) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.cpf = cpf;
		this.rg = rg;
		this.dataAluguel = dataAluguel;
		this.dataDevolu��o = dataDevolu��o;
		this.telefone = telefone;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(String dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public String getDataDevolu��o() {
		return dataDevolu��o;
	}
	public void setDataDevolu��o(String dataDevolu��o) {
		this.dataDevolu��o = dataDevolu��o;
	}

	public Carro getCarros() {
		return carros;	
	}
	public void setCarros(Carro carros) {
		this.carros = carros;
	}
	// -> M�todo de Exibi��o <- 
	public void ver() {
		System.out.println(	"Nome: " + this.getNome() +
							"| Endere�o: " + this.getEndere�o() +
							"| CPF: " + this.getCpf() +
							"| RG: " + this.getRg() +
							"| Telefone: " + this.getTelefone() +
							"| Idade: " + this.getIdade() +
							"| Data do Aluguel: " + this.getDataAluguel() +
							"| Data da Devolu��o: " + this.getDataDevolu��o()
						  );
	}
}