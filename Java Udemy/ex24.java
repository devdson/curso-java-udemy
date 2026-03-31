import java.util.Random;
/*Escreva um programa Java que preencha um array de inteiros com valores
aleatórios entre 1 e 100 e, em seguida, imprima o índice do primeiro elemento par
encontrado no array. */
public class ex24 {

    public static void main(String[] args) {

        int[] numeros = new int[10]; // tamanho do array
        Random random = new Random();

        // Preenche o array com valores aleatórios entre 1 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Procura o primeiro número par
        int indicePar = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                indicePar = i;
                break; // para no primeiro par encontrado
            }
        }

        // Exibe o resultado
        if (indicePar != -1) {
            System.out.println("Primeiro número par encontrado no índice: " + indicePar);
            System.out.println("Valor: " + numeros[indicePar]);
        } else {
            System.out.println("Nenhum número par foi encontrado.");
        }
    }
}
