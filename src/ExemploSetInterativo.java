import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;


public class ExemploSetInterativo { //classe publica
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set <String> frutas = new HashSet<>();
		
		while (true) {
			try { //tentativas das 5 opções
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Adicionar uma fruta");
			System.out.println("2. Listar todas as frutas");
			System.out.println("3. Remover uma fruta");
			System.out.println("4. Verificar se uma fruta está presente");
			System.out.println("5. Sair");
			System.out.print("Opção: ");
			
			int opcao = scanner.nextInt();//scanner do int do usuario
			scanner.nextLine();
			
			switch(opcao) { //opcao 1, adicionar fruta
			case 1:
				System.out.print("Digite o nome da fruta para adicionar:");
				String novaFruta = scanner.nextLine();
				if (frutas.add(novaFruta)) {
					System.out.println(novaFruta + " foi adicionada.");
				} else {
					System.out.println(novaFruta + " já está presente.");
				}
				break;
			case 2: //opcao 2, mostrar
				System.out.println("Frutas: " + frutas);
				break;
			case 3: //opcao 3 remover frutas
				System.out.println("Digite o nome da fruta que deseja remover: ");
				String frutaRemover = scanner.nextLine();
				if (frutas.remove(frutaRemover)) {
					System.out.println(frutaRemover + " foi removida.");
				} else {
					System.out.println(frutaRemover + " não foi encontrada.");
				}
				break;
			case 4: ///opcao 4, verificar fruta
				System.out.println("Digite o nome da fruta para verificar:");
				String frutaVerificar = scanner.nextLine();
				if (frutas.contains(frutaVerificar)) {
					System.out.println(frutaVerificar + " está presente no conjunto.");
				} else {
					System.out.println(frutaVerificar + " não foi encontrada.");
				}
				break;
			case 5: //opcao 5; finalizar
				System.out.println("Saindo...");
				scanner.close();
				return;
			default: //caso não esteja nas opões disponiveis
				System.out.println("Opção invalida. Tente novamente");
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, digite um número."); ///caso não seja valida a entrada (não numeros)
			scanner.nextLine();	
		}
	}
}
}




