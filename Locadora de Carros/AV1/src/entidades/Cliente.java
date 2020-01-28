package entidades;

import entidades.Carro;

public class Cliente {

	private String nome;
	private String endereço;
	private String cpf;
	private String rg;
	private String dataAluguel;
	private String dataDevolução;
	private Carro carros;
	private int telefone;
	private int idade;

	public Cliente() {}
	
	public Cliente(String nome, String endereço, String cpf, String rg, String dataAluguel, String dataDevolução, int telefone, int idade) {
		this.nome = nome;
		this.endereço = endereço;
		this.cpf = cpf;
		this.rg = rg;
		this.dataAluguel = dataAluguel;
		this.dataDevolução = dataDevolução;
		this.telefone = telefone;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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

	public String getDataDevolução() {
		return dataDevolução;
	}
	public void setDataDevolução(String dataDevolução) {
		this.dataDevolução = dataDevolução;
	}

	public Carro getCarros() {
		return carros;	
	}
	public void setCarros(Carro carros) {
		this.carros = carros;
	}
	// -> Método de Exibição <- 
	public void ver() {
		System.out.println(	"Nome: " + this.getNome() +
							"| Endereço: " + this.getEndereço() +
							"| CPF: " + this.getCpf() +
							"| RG: " + this.getRg() +
							"| Telefone: " + this.getTelefone() +
							"| Idade: " + this.getIdade() +
							"| Data do Aluguel: " + this.getDataAluguel() +
							"| Data da Devolução: " + this.getDataDevolução()
						  );
	}
}