import java.util.Scanner;


public class ex04 {

// Escreva um programa que determine se um número é positivo, negativo ou zero.
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número: ");
        float n = leitor.nextFloat(); 

        if (n > 0){
            System.out.println("O número é positivo.");
        } else if(n < 0){
            System.out.println("O número é negativo.");
        } else{
            System.out.println("O número é Zero.");
        }

        leitor.close();
    }
    
}
