import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args){

        Scanner leitorTeclado = new Scanner(System.in);

        // Calcular IMC

        System.out.println("Digite seu peso: ");
        float peso = leitorTeclado.nextFloat();

        System.out.println("Digite sua altura: ");
        float altura = leitorTeclado.nextFloat();

        float imc = peso / (altura*altura);

        System.out.println("O IMC é: " + imc);


        leitorTeclado.close();

    }
    
}
