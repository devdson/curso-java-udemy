import java.util.Scanner;
public class ex16 {

/*Crie um programa Java que simule uma calculadora de impostos. Solicite ao usuário
que informe o salário bruto e utilize uma expressão booleana para determinar se o
salário está sujeito ao imposto de renda (acima de R$ 2000,00). Se estiver, calcule e
imprima o valor do imposto (15% sobre o excedente). */

    public static void main(String[] args) {

        System.out.println("Informe o salário bruto: ");
        Scanner scanner = new Scanner(System.in);

        int salario = scanner.nextInt();

        // Cálculos
        boolean imposto = salario > 2000;
        int excedente = salario - 2000;
        double taxa = excedente + (0.15 * excedente);

        if (imposto) {

            System.out.println("O valor da taxa é: " + taxa);
        } else {

            System.out.println("Você não está sujeito a imposto");
        }

        scanner.close();
        
    }
    
}
