package company;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.Carro;
import entidades.Cliente;

public class locadora{

	public static void main(String[] args){
		
		// M�todo de Captura do teclado
		Scanner sc = new Scanner(System.in); // dinhoaps@gmail.com
		Locale.setDefault(Locale.US);
		
		// Criando os carros - marca, nome, cor, tipoMotor, potenciaMotor, KM
		Carro Palio = new Carro("Fiat", "Palio", "Prata", "Total Flex", 1.0, 50.000);
		Carro HB20 = new Carro("Hyunday", "HB20", "Branco", "Total Flex", 1.6, 40.000);
		Carro Gol = new Carro("Volkswagem","Gol", "Preto", "Gasolina", 1.0, 55.000);
		Carro Camaro = new Carro("GM", "Camaro", "Amarelo", "Total Flex", 3.0, 15.000);
		Carro Ford_Fusion = new Carro("Ford", "Fusion", "Preto", "Total Flex ", 2.0, 15.000);
		Carro Dodge_Viper = new Carro("Dodge", "Viper", "Azul", "Total Flex ", 3.0, 5.000);
		
		// Total de Carros
		Carro[] totalCarros = new Carro[15];
			totalCarros[0] = Palio;
			totalCarros[1] = Palio;
			totalCarros[2] = Palio;
			totalCarros[3] = HB20;
			totalCarros[4] = HB20;
			totalCarros[5] = Gol;
			totalCarros[6] = Gol;
			totalCarros[7] = Gol;
			totalCarros[8] = Gol;
			totalCarros[9] = Gol;
			totalCarros[10] = Camaro;
			totalCarros[11] = Camaro;
			totalCarros[12] = Camaro;
			totalCarros[13] = Ford_Fusion;
			totalCarros[14] = Dodge_Viper;

		// Carros Alugados
		Carro[] carAlugados = new Carro[6];
		
			carAlugados[0] = totalCarros[0];// palio0
			carAlugados[1] = totalCarros[3];// hb20
			carAlugados[2] = totalCarros[5];// gol
			carAlugados[3] = totalCarros[11];// camaro
			carAlugados[4] = totalCarros[13];// ford fusion
			carAlugados[5] = totalCarros[14];// Douge viper
			
		
		// Vari�veis para o Cadastro do Cliente
		Cliente[] clientes = new Cliente[1]; // Atribuir os clientes do la�o 
		
		// Condi��o para Menu Cliente e Menu Funcion�rio
		int opcao = 0;
	
		
		// MENU PRINCIPAL
		do{
			
			// Op��es do Menu	
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o:" + 
																 "\n1 - Cadastrar Cliente" + 
																 "\n2 - Escolher Carro" + 
																 "\n3 - Controle de Frota" + 
																 "\n4 - Sair.")); 
			switch (opcao) {
				case 1: 
					// Cadastro do Cliente
					System.out.println("                                 CADASTRO DE CLIENTES                                    ");
					System.out.println("-----------------------------------------------------------------------------------------");
					for (int i = 0; i < clientes.length; i++){
						System.out.println("Nome: ");
						String nome = sc.nextLine();
							sc.nextLine(); // Limpar o buff
						System.out.println("Endere�o: ");
						String endere�o = sc.nextLine();
						System.out.println("CPF: ");
						String cpf = sc.nextLine();
						System.out.println("RG: ");
						String rg = sc.nextLine();
						System.out.println("Telefone: ");
						int telefone = sc.nextInt();
							sc.nextLine(); // Limpar o buff
						System.out.println("Idade: ");
						int idade = sc.nextInt();
							sc.nextLine(); // Limpar o buff
						System.out.println("Data do Aluguel: ");
						String dataAluguel = sc.nextLine();
						System.out.println("Data da Devolu��o: ");
						String dataDevolu��o = sc.nextLine();
						
						// Construtor de Cliente - Definindo os par�metros de Exibi��o
						clientes[i] = new Cliente(nome, endere�o, cpf, rg, dataAluguel, dataDevolu��o, telefone, idade);
					}// Fim La�o Cadastro do Cliente
					
					// -> Exibi��o do Cliente que acabou de se cadastrar <- 	
					for (int i = 0; i < clientes.length; i++){
						System.out.println("\n");
						System.out.println("Cliente cadastrado:");
							clientes[i].ver();
						break;
					}// Fim la�o for Exibi��o do cliente
					System.out.println("\n");
					System.out.println("Pressione ENTER para continuar..");
					System.out.println("-----------------------------------------------------------------------------------------");
					// Pausar o sistema	
					try {
						System.in.read();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					break;
					
				case 2: 
					// Escolha do Carro / Exibi��o
					System.out.println("\n");
					System.out.println("                                     LISTA DE CARROS                                     ");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.printf("1 - ");
						carAlugados[0].vercarro();
					System.out.println("\n");
					System.out.printf("2 - ");
						carAlugados[1].vercarro();
					System.out.println("\n");
					System.out.printf("3 - ");
						carAlugados[2].vercarro();
					System.out.println("\n");
					System.out.printf("4 - ");
						carAlugados[3].vercarro();
					System.out.println("\n");
					System.out.printf("5 - ");
						carAlugados[4].vercarro();
					System.out.println("\n");
					System.out.printf("6 - ");
						carAlugados[5].vercarro();
					System.out.println("\n");
					
					// Condi��es para alocar	
					int escolherCarro;
					System.out.println("Escolha um Carro:");
						escolherCarro = sc.nextInt();
					System.out.println("\n");
					System.out.println("Carro cadastrado:");
					
					// Aloca��o de mem�ria do carro escolhido
					switch (escolherCarro) {
						case 1:
							carAlugados[0].vercarro();
							break;
						case 2:
							carAlugados[1].vercarro();
							break;
						case 3:
							carAlugados[2].vercarro();
							break;
						case 4:
							carAlugados[3].vercarro();
							break;
						case 5:
							carAlugados[4].vercarro();
							break;
						case 6:
							carAlugados[5].vercarro();
							break;
					}// Fim Switch de exibi��o dos Carros
				
					// Est�tica para organiza��o
					System.out.println("\n");
					System.out.println("Pressione ENTER para continuar..");
					System.out.println("-----------------------------------------------------------------------------------------");
					// Pausar o sistema	
					try {
						System.in.read();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					break;
				// Controle da Frota	
				case 3:
					System.out.println("\n");
					System.out.println("                                    CONTROLE DA FROTA                                    ");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Carros Alugados: ");
						carAlugados[0].vercarro();
						carAlugados[1].vercarro();
						carAlugados[2].vercarro();
						carAlugados[3].vercarro();
						carAlugados[4].vercarro();
						carAlugados[5].vercarro();
					System.out.println("\n");
					System.out.println("Carros Dispon�veis: ");
						totalCarros[1].vercarro();
						totalCarros[2].vercarro();
						totalCarros[4].vercarro();
						totalCarros[6].vercarro();
						totalCarros[7].vercarro();
						totalCarros[8].vercarro();
						totalCarros[9].vercarro();
						totalCarros[10].vercarro();
						totalCarros[12].vercarro();
						System.out.println("\n");
						System.out.println("Pressione ENTER para continuar..");
						System.out.println("-----------------------------------------------------------------------------------------");
						
						// Pausar o sistema	
						try {
							System.in.read();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
					break; // Fim Case 3 do MENU PRINCIPAL
					// Sair do MENU
				case 4:
	                System.exit(1);
			default:
				JOptionPane.showMessageDialog(null, "Escolha inv�lida!!!");
	            break;
			}// Fim do switch do MENU PRINCIPAL	
				
		} while(opcao != 4);
			sc.close();
	}// Fim do MAIN
	
}// Fim da Classe LOCADORA

