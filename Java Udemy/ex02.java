import java.util.Scanner;

public class ex02 {

// Escreva um programa que declare uma variável do tipo double e calcule o quadrado desse número.
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Declare um valor: ");
        double n = leitor.nextDouble();

        double quadrado = n*n;
        System.out.println("O quadrado de " + n + " é " + quadrado);

        leitor.close();


    }
}