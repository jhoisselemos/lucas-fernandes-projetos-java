package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {

	private ArrayList<Produtos> carrinho = new ArrayList();
	private float valorCompra;

	public ArrayList<Produtos> getCarrinho() {
		return carrinho;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	
	
	public void adicionarAoCarrinho(Produtos produto) {
		if (this.getCarrinho().size() < 10) {
			this.getCarrinho().add(produto);
			this.setValorCompra(this.getValorCompra() + produto.getPreco());

			System.out.println("Adicionado ao carrinho");
		} else {
			System.out.println("Não é permitido adicionar mais de 10 itens ao carrinho.");
		}
	}
	
	

	public void mostrarCarrinho() {
		if (this.getCarrinho().isEmpty()) {
			System.out.println("Seu Carrihno está vazio");
		} else {
			System.out.println("\n                    CARRINHO\n");
			for (Produtos prod : this.getCarrinho()) {
				System.out.println(prod + "\n");
			}
			System.out.println("\nTotal: " + this.getValorCompra());

			System.out.println("\n  1. Continuar Comprando");
			System.out.println("  2. Finalizar Compra");
			System.out.println("  3. Remover Item do Carrinho");

			Scanner sc5 = new Scanner(System.in);
			int resp3 = sc5.nextInt();
			sc5.reset();

			switch (resp3) {
			case 1:
				
				break;
			case 2:
				finalizarCompra();
				break;
			case 3:
				System.out.println("Informe o Código de Barras ou o Número de Serie do Produto");
				resp3 = sc5.nextInt();
				removerItemDoCarrihno(resp3);
				break;
			default:
				break;
			}
		}
	}
	
	public void removerItemDoCarrihno(int codBarra){
        
        if(this.getCarrinho().contains(procurandoItem(codBarra))){
            this.getCarrinho().remove(procurandoItem(codBarra));
            System.out.println("Item removido");
            this.setValorCompra(this.getValorCompra() - this.procurandoItem(codBarra).getPreco());
        }
        else{
            System.out.println("Esse produto não está no carrihno");
        }
    }
	
	
	public Produtos procurandoItem(int codBarra){
        for(Produtos prod: this.getCarrinho()){
            if(prod.getCodBarra() == codBarra){
                return prod;
            }
        }
        return null;
    }
	

		public void finalizarCompra(){
			carrinho.clear();
			
		}

}// FIM CARRINHO0