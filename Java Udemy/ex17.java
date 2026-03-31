import java.util.Scanner;
public class ex17 {
    
/*Escreva um programa Java que permita ao usuário digitar a idade de uma pessoa e
utilize o operador ternário para determinar se a pessoa é maior ou menor de idade,
exibindo uma mensagem correspondente. */
    public static void main(String[] args) {

        System.out.println("Digite sua idade: ");

        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();

        String deMaior = idade >= 18 ? "Você é de maior." : "Você é de menor";
        System.out.println(deMaior);

        scanner.close();
        
    }
}
