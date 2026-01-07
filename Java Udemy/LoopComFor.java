import java.util.Scanner;

public class LoopComFor {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor: ");
        int valor = leitor.nextInt();

        for (int contador = 1 ; contador <= valor ; contador++ ) {

            System.out.println(contador);
        }

        leitor.close();
    }
}
