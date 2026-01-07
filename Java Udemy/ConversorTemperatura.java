import java.util.Scanner;

public class ConversorTemperatura {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Célsius: ");
        float c = leitor.nextFloat();

        float f = c * 1.8f + 32;

        System.out.println(c + "para Fahrenheit é: " + f);

        leitor.close();

    }
}
