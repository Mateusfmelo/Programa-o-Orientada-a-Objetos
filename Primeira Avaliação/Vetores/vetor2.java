import java.util.Scanner;

public class vetor2 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int n = 8;
    int a[] = new int[n];
    int b[] = new int[n];
    int i;

    for (i = 0; i < n; i++) {
      System.out.printf("Informe o %do. elemento de %d: ", (i + 1), n);
      a[i] = ler.nextInt();
    }

    for (i = 0; i < n; i++) {
      b[i] = a[i] * 2;
    }

    System.out.printf("\n\ni- a[i]   b[i] = a[i] * 2\n");
    System.out.printf("=========================\n");
    for (i = 0; i < n; i++) {
      System.out.printf("%d- %4d   %4d\n", i, a[i], b[i]);
    }
    System.out.printf("=========================\n");
  }
}