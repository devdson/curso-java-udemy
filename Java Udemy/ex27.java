import java.util.Random;

/*Crie um programa Java que preencha um array de inteiros com valores aleatórios
entre 1 e 50 e, em seguida, imprima a média dos valores maiores que 25 */

public class ex27 {

    public static void main(String[] args) {
        int[] numeros = new int[10]; // tamanho do array
        Random random = new Random();

        int soma = 0;
        int contador = 0;

        // Preenche o array com valores aleatórios entre 1 e 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }

        // Calcula a média dos valores maiores que 25
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 25) {
                soma += numeros[i];
                contador++;
            }
        }

        // Exibe os resultados
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos valores maiores que 25: " + media);
        } else {
            System.out.println("Não há valores maiores que 25 no array.");
        }
    }
}
