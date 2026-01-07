import java.util.Scanner;

public class TipoDeTriângulo {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        float l1 = leitor.nextFloat();

        System.out.println("Digite o segundo lado do triângulo: ");
        float l2 = leitor.nextFloat();

        System.out.println("Digite o terceiro lado do triângulo: ");
        float l3 = leitor.nextFloat();

        if (l1 == l2 && l2 == l3){
            System.out.println("O triângulo é Equilátero.");
        } else if (l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        leitor.close();

    }
}
