import java.util.Scanner;

public class MenuDoWhile {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        do { 

            System.out.println("Digite uma opção do menu: ");

            System.out.println("1. Sanduiche");
            System.out.println("2. Batata");
            System.out.println("3. Pizza");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            if(opcao == 0){
                System.out.println("Saindo do sistema...");
            }else if (opcao == 1) {
                System.out.println("Você pegou um sanduiche.");
            }else if (opcao == 2) {
                System.out.println("Você pegou uma batata");
            }else if (opcao == 3) {
                System.out.println("Você pegou uma pizza");
            }
            
        } while (opcao != 0);

        scanner.close();
    }
    
}
