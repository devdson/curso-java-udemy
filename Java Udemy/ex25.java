import java.util.Scanner;
/*Crie um programa Java que solicite ao usuário que insira o tamanho de um array de
inteiros e, em seguida, preencha o array com números fornecidos pelo usuário. Por
fim, imprima o array. */
public class ex25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        // Preenche o array com valores do usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Imprime o array
        System.out.println("\nValores do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}

