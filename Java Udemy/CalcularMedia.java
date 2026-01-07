import java.util.Scanner;

public class CalcularMedia {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        // Calcular Média

        System.out.println("Digite a nota do primeiro trimestre: ");
        float primeiro = leitor.nextFloat();

        System.out.println("Digite a nota do segundo trimestre: ");
        float segundo = leitor.nextFloat();

        System.out.println("Digite a nota do terceiro trimestre");
        float terceiro = leitor.nextFloat();

        float media = (primeiro + segundo + terceiro) / 3;

        System.out.println("Sua média foi: " + media);

        if (media >= 7 ){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        leitor.close();

    }
}
