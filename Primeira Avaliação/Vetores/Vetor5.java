import java.util.Scanner;
public class Vetor5 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int n = 10; 
      int a[] = new int[n]; 
      int b[] = new int[n];
      int i; 

      for (i=0; i<n; i++) {
        System.out.printf("Escreva o %2do. elemento de %d: ", (i+1), n);
        a[i] = teclado.nextInt();
      }

      for (i=0; i<n; i++) {
        b[i] = a[i] * i;
      }

      for (i=0; i<n; i++) {
        System.out.printf("%d %4d   %4d\n", i, a[i], b[i]);
      }
    }
}