import java.util.Scanner;
public class Quadrado{

    Scanner inicio = new Scanner(System.in);
    double lado, area, perimetro;

    double CalcularArea(){
        area = lado * lado;
        return area;
    }

    double CalcularPerimetro(){
        perimetro = 4 * lado;
        return perimetro;
    }

    void print(){
        System.out.println("O quadrado que tem o lado de: "
        + lado + "\n Área: " + CalcularArea()
        + "\nPerimetro: " + CalcularPerimetro());
    }

    void construtor(){
        System.out.println("Informe o valor do lado do quadrado:");
        lado = inicio.nextDouble();
    }
}