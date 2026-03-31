public class ex26 {
/*Crie um programa Java que declare um array de inteiros e verifique se ele está
ordenado de forma crescente.
 */
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9};

        boolean estaOrdenado = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                estaOrdenado = false;
                break;
            }
        }

        if (estaOrdenado) {
            System.out.println("O array está ordenado de forma crescente.");
        } else {
            System.out.println("O array NÃO está ordenado de forma crescente.");
        }
    }
}
