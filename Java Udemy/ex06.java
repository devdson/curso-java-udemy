import java.util.Scanner;

public class ex06 {

/*Tendo como entrada a altura e o sexo (codificado da seguinte forma:
digitando 1:feminino e digitando 2:masculino) de uma pessoa, construa um
programa que
calcule e imprima seu peso ideal, utilizando as seguintes
Fórmulas:
- para homens: (72.7 * Altura) – 58
- para mulheres: (62.1 * Altura) – 44.7 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitando a entrada da altura e do sexo
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (1 para feminino, 2 para masculino): ");
        int sexo = scanner.nextInt();

        // Calculando o peso ideal com base no sexo
        double pesoIdeal;

        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Sexo inválido.");
            scanner.close();
            return;
        }

        // Exibindo o peso ideal
        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

        scanner.close();
    }
}
