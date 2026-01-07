import java.util.Scanner;

public class CalcularIdade {

    public static void main(String[] args){

        // Calcular Idade

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        
        int resultado = anoAtual - anoNascimento;

        if(resultado < 18){
            System.out.println("Sua idade é " + resultado + " e você não pode dirigir.");
        } else if(resultado > 80) {
            System.out.println("Sua idade é " + resultado + " você é idoso");
        } else {
            System.out.println("Sua idade é " + resultado + " você é adulto e pode dirigir.");
        }

        teclado.close();

    }
    
}
