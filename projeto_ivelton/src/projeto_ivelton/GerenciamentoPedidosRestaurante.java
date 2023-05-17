package projeto_ivelton;

import java.util.Scanner;

public class GerenciamentoPedidosRestaurante {
	 
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Restaurante restaurante = new Restaurante();

		        // Cadastrar mesas
		        restaurante.adicionarMesa(new Mesa(1));
		        restaurante.adicionarMesa(new Mesa(2));
		        restaurante.adicionarMesa(new Mesa(3));

		        int op=1;
		        
		        
		        
		        
		        
		       
		        
		        while (true) {
		            System.out.println("=== Sistema de Gerenciamento de Pedidos ===");
		            System.out.print("Digite o número da mesa (ou 0 para sair): ");
		            int numeroMesa = scanner.nextInt();
		            if (numeroMesa == 0) {
		                break;
		            }

		            Mesa mesa = restaurante.buscarMesa(numeroMesa);
		            if (mesa == null) {
		                System.out.println("Mesa não encontrada. Tente novamente.");
		                continue;
		            }

		            if (mesa.isFechada()) {
		                System.out.println("Essa mesa já foi fechada.");
		                continue;
		            }

		            while (true) {
		                System.out.println("=== Menu ===");
		                System.out.println("1. Adicionar pedido");
		                System.out.println("2. Fechar mesa");
		                System.out.print("Escolha uma opção: \n\n");
		                int opcao = scanner.nextInt();

		                if (opcao == 1) {
		                    System.out.println("=== Cardápio ===");
		                    System.out.println("1. Pizza - R$20.00");
		                    System.out.println("2. Hambúrguer - R$15.00");
		                    System.out.println("3. Refrigerante - R$5.00");
		                    System.out.println("0. Voltar\n");

		                    System.out.print("Escolha um item do cardápio (ou 0 para voltar): ");
		                    int itemEscolhido = scanner.nextInt();
		} if(opcao==2) {
			System.out.println("---mesa fechada--- \n");
			System.out.println("---obrigado pela preferencia,volte sempre ou faça um novo pedido abaixo: --- \n");
		}
		            }
		        }
		    }
}
		    
