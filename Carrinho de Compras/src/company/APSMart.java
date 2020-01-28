package company;

import java.util.Scanner;

import entidades.Alimentos;
import entidades.Carrinho;
import entidades.Higiene;
import entidades.Produtos;
import entidades.SOM;
import entidades.Smartphone;
import entidades.TV;

public class APSMart {

	public static void main(String[] args) {
		
		Carrinho carrinho = new Carrinho();
		boolean repetir = true;

		do {

			System.out.println("                            APS MART ");
			System.out.println("------------------------------------------------------------------");
			System.out.println("      Escolha um tipo de Produto e aproveite nossas ofertas:      ");
			System.out.println("  1.Higiene  |   2.Alimentos  |   3.Eletrônicos    |   4.Carrinho ");

			// Entrada de Dados
			Scanner sc = new Scanner(System.in);
			int resp = sc.nextInt();

			Scanner sc2 = new Scanner(System.in); 
			
			
			Scanner sc3 = new Scanner(System.in); 
		
			
			Scanner sc4 = new Scanner(System.in); 
			
			
			switch (resp) {

			case 1:
				System.out.println("\n   Produtos de Higiene\n");
				ProdutosHigiene(-1);

				System.out.println("Escolha um produ0to (1,2,3...)");
					int resp2 = sc2.nextInt();
				carrinho.adicionarAoCarrinho(ProdutosHigiene(resp - 1));
				break;

			case 2:
				System.out.println("\n  Produtos Alimentícios\n");
				ProdutosAlimento(-1);

				System.out.println("Escolha um produto (1,2,3...)");
					int resp3 = sc3.nextInt();
				carrinho.adicionarAoCarrinho(ProdutosAlimento(resp - 1));
				break;

			case 3:
				System.out.println("\n  Produtos Eletrônicos\n");
				ProdutosEletronicos(-1);

				System.out.println("Escolha um produto (1,2,3...)");
					int resp4 = sc4.nextInt();
				carrinho.adicionarAoCarrinho(ProdutosEletronicos(resp - 1));
				break;

			case 4:
				carrinho.mostrarCarrinho();
				break;

			default:
				System.out.println("Opção inválida");

			}// FIM SWITCH

		} while (repetir);

	}// FIM MAIN

	public static Produtos ProdutosEletronicos(int x) {
		// tipo, cor, fabricante, tamanho, preco, cod barra
		SOM[] som = new SOM[2];
		som[0] = new SOM( "Mini System", "Preto", "Panasonic", "Tela 6.2''", 459.00f, 125);
		som[1] = new SOM("Home Theater", "Branco","Sony", "4--Torres 1m", 895.25f, 122);

		Smartphone[] smartphone = new Smartphone[2];
		smartphone[0] = new Smartphone("Mi--8 | 64GB", "Preto","Xiomi", "Tela 6''", 1399.00f, 123);
		smartphone[1] = new Smartphone("Zenfone--7 | 64GB ", "Preto", "Asus", "Tela 6.2''", 1698.00f, 124);

		TV[] tv = new TV[2];
		tv[0] = new TV("4K", "Prata", "Samsung","50'' polegadas", 8000.00f, 159);
		tv[1] = new TV("LCD", "Preta", "LG", "60'' polegadas", 10000.00f, 789);
		
		if (x == -1) {
			for (int i = 0; i < 2; i++) {

				System.out.print((i + 1) + " - ");
				System.out.println(som[i] + "\n");
				
			}
		} else 
			return som[x];
		
	return null;
	}

	public static Produtos ProdutosHigiene(int x) {
		// tipo, nome, fabricante, preco, peso, cod barra
		Higiene[] higiene = new Higiene[6];
		higiene[0] = new Higiene("Creme Dental", "3D White Perfection", "Oral-B", 75, 12.00f, 111);
		higiene[1] = new Higiene("Creme Dental","Máxima Proteção Anticáries",  "Colgate", 180, 5.95f, 112);
		higiene[2] = new Higiene("Shampoo","Restauração Profunda",  "Pantene", 400, 19.99f, 113);
		higiene[3] = new Higiene("Shampoo", "Óleo Hidratação", "Seda", 325, 9.02f, 114);
		higiene[4] = new Higiene("Sabonete", "Fragancias", "Protex", 90, 1.89f, 115);
		higiene[5] = new Higiene("Sabonete","Fragancias","Even",  90, 0.99f, 116);

		if (x == -1) {
			for (int i = 0; i < 6; i++) {
				System.out.print((i + 1) + " - ");
				System.out.println(higiene[i] + "\n");
			}
		} else
			return higiene[x];

		return null;
	}

	public static Produtos ProdutosAlimento(int x) {
		// tipo, nome, fabricante, preco, peso, cod barra
		Alimentos[] alimento = new Alimentos[6];
		alimento[0] = new Alimentos("Arroz", "Parboilizado Tipo 1", "Tio Joao", 5.00f, 1, 117);
		alimento[1] = new Alimentos("Arroz", "Branco Longo-fino Tipo 1", "Camil", 4.00f, 1, 118);
		alimento[2] = new Alimentos("Feijao", "Carioca Tipo 1", "Kicaldo", 5.00f, 1, 119);
		alimento[3] = new Alimentos("Feijao", "Carioca Tipo 1", "Broto Legal", 4.00f, 1, 110);
		alimento[4] = new Alimentos("Carne", "Peça de Contra Filé Bovino Congelado", "Frigorifico Padre Cicero", 15.21f, 1, 120);
		alimento[5] = new Alimentos("Carne", "Peça de Picanha Bovina Argentina Congelada", "Frigorifico Padre Pedro", 14.65f, 1, 121);

		if (x == -1) {
			for (int i = 0; i < 6; i++) {
				System.out.print((i + 1) + " - ");
				System.out.println(alimento[i] + "\n");
			}
		} else
			return alimento[x];

		return null;
	}// FIM METODO

}// FIM APS-Mart