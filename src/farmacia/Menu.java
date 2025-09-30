package farmacia;

import java.util.InputMismatchException;
import java.util.Scanner;

import farmacia.model.Cosmetico;
import farmacia.model.Medicamento;
import farmacia.model.Produto;
import farmacia.util.Cores;

public class Menu {
	private static final Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao;
		
		while(true) {
			
			System.out.println(Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_PURPLE_BOLD +
					"\n*******************************************************");
			System.out.println("	        Bem vindo(a) a FarmáciaByte               ");
			System.out.println("*******************************************************");
			System.out.println("          [1] - Criar produto                          ");
			System.out.println("          [2] - Listar todas os produtos               ");
			System.out.println("          [3] - Consultar produto pelo Id              ");
			System.out.println("          [4] - Atualizar produto                      ");
			System.out.println("          [5] - Deletar produto                        ");
			System.out.println("          [0] - Sair                                   ");
			System.out.println("                                                       ");
			System.out.println("*******************************************************");
			System.out.println("                                                       ");
			System.out.println("Entre com a opção desejada:                            ");
			System.out.println("                                                       "+
			Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			}catch(InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 5: ");
				leia.nextLine();
			}
			
			if(opcao == 0) {
				System.out.println(Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_PURPLE_BOLD+
						"FarmáciaByte sua melhor escolha!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			
			switch(opcao) {
			case 1:
				System.out.println("Criar produto\n\n");
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os produtos\n\n");
				keyPress();
				break;
			case 3:
				System.out.println("Consultar produto pelo Id\n\n");
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar produto\n\n");
				keyPress();
				break;
			case 5:
				System.out.println("Deletar produto\n\n");
				keyPress();
				break;
			default:
				System.out.println("\nOpção inválida!\n");
				keyPress();
				break;
			}
		}
	}
	public static void sobre() {
		System.out.println(Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_PURPLE_BOLD+
				"\n*******************************************************");
		System.out.println("Projeto Desenvolvido por:                              ");
		System.out.println("Sofia de Araújo                                        ");
		System.out.println("github.com/sofia-araujo                                ");
		System.out.println("*******************************************************");
	}
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET+"\n\nPressione Enter para continuar...");
		leia.nextLine();
	}
}
