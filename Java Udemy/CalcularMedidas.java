import java.util.Scanner;

public class CalcularMedidas {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do lado maior: ");
        float maior = leitor.nextFloat();

        System.out.println("Digite o valor do lado menor: ");
        float menor = leitor.nextFloat();

        float p = 2*maior +  2*menor;

        System.out.println("O perímetro do retângulo é: " + p);

        leitor.close();
    }

    
}
