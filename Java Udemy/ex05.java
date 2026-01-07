import java.util.Scanner;

public class ex05 {
    
/* Dado que existe um mercado onde as maçãs custam R$ 0,30 cada se forem
compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos
doze. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o valor total da compra. */ 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas maçãs vai querer? ");
        int macas = leitor.nextInt();

        float valor;

        if (macas < 12) {
            valor = macas * 0.30f; 
        } else {
            valor = macas * 0.25f;
        }

        System.out.println("A compra deu: " + valor + " reais");

        leitor.close();
    }
}
