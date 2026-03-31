public class ex11 {

/*Escreva um programa Java que imprima os números de 1 a 100, substituindo os
múltiplos de 3 por "Fizz" e os múltiplos de 5 por "Buzz". Para os números que são
múltiplos de ambos, imprima "FizzBuzz". Pode utilizar qualquer laço de repetição
(while ou for) */
    public static void main(String[] args) {
        
        for (int n1 = 1; n1 <= 100 ; n1++){

            if(n1 % 3 == 0 && n1 % 5 == 0) {

                System.out.println("FizzBuzz");
            } else if (n1 % 3 == 0){

                System.out.println("Fizz");
            } else if (n1 % 5 ==0) {

                System.out.println("Buzz");
            } else {

                System.out.println(n1);
            }


        }
    }
    
}
