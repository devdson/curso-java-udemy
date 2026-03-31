public class ex08 {

/*Escreva um programa Java que calcule a soma dos números de 1 a 100 usando um
loop while. */

    public static void main (String[] args) {

        int a = 0;
        int b = 1;

        while(b <= 100){

            a += b;
            b++;
        }

    System.out.println("o resultado é: "+ a);

    }
}
