package biblioteca;
import java.util.Scanner;

public class Vetor {
    private static final int j = 0;

    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        int numeros[][] = new int [5][5];

        for (int linha = 0; linha < numeros.length; linha++){
            System.out.println("Digite os números da " + (linha + 1) + "ª linha ");
            for (int coluna = 0; coluna < numeros[linha].length; coluna++){
                System.out.println("Digite o " + (coluna + 1) + "ª número da " + (linha + 1 ) + " linha: ");
                numeros [linha] [coluna] = teclado.nextInt();
            }
        }

        //println Para imprimir um abaixo do outro
        for ( int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros.length; j++);{
                System.out.print(numeros[i] [j]+ " ");
        }
    }

        System.out.println();
        for (int linhaDaVez[] : numeros){
            for (int colunaDaVez : linhaDaVez) 
                System.out.print(colunaDaVez + " ");
        }
}
}