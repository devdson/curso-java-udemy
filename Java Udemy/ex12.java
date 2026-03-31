public class ex12 {

/*Escreva um programa Java 
que calcule a soma dos dígitos de um número inteiro. */
    public static void main(String[] args) {

        int numero = 12345;
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("Soma dos dígitos: " + soma);
        
    }
}
