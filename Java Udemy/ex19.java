import java.util.Scanner;

public class ex19 {

/*Escreva um programa Java que simule um sistema de autenticação. Solicite ao
usuário que digite um nome de usuário e uma senha. Utilize uma expressão
booleana para verificar se o nome de usuário é "admin" e a senha é "1234". Em caso
afirmativo, exiba uma mensagem de sucesso; caso contrário, exiba uma mensagem
de erro.
 */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        
        //autenticador
        boolean aut = "admin".equals(usuario) && "1234".equals(senha);

        if (aut) {

            System.out.println("Login bem sucedido.");
        } 
        else {

            System.out.println("Falha ao logar.");
        }

        scanner.close();
    }
}