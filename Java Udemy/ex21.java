public class ex21 {

/*Crie um programa Java que declare um array de strings com nomes de pessoas e
imprima todos os nomes em ordem inversa. */

    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "davidson";
        nomes[1] = "lucas";
        nomes[2] = "marcus";

        for(int i = nomes.length - 1; i >= 0; i-- ){

            System.out.println(nomes[i]);
        }
        

    }
    
}
