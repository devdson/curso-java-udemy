public class ex10 {

/*Escreva um programa Java que imprima os números primos entre 1 e 50 usando um
loop for.
 */
    public static void main(String[] args) {

        for (int num = 2; num <= 50; num++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num);
            }
        }

    }
}

