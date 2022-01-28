import java.util.Scanner;
public class Vetor9 {
    public static void main(String[] args) {
      Scanner imprimir = new Scanner(System.in);

      int n = 10; 
      int a[] = new int[n]; 
      int b[] = new int[n];
      double c[] = new double[n];
      int i; 

      for (i=0; i<n; i++) {
        System.out.printf("Escreva o %2do. elemento de %d do Vetor A: ", (i+1), n);
        a[i] = imprimir.nextInt();
      }

      System.out.printf("\n\n");

      for (i=0; i<n; i++) {
        System.out.printf("Escreva o %2do. elemento de %d do Vetor B: ", (i+1), n);
        b[i] = imprimir.nextInt();
      }

      for (i=0; i<n; i++) {
        c[i] = a[i] / (float)b[i];              //Divisão
      }

      for (i=0; i<n; i++) {
        System.out.printf("%d- %4d   %4d   %7.2f\n", i, a[i], b[i], c[i]);
      }
    }
}