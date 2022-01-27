import java.util.Scanner;

public class Quadrado {

    Scanner inicio = new Scanner(System.in);
    double lado, area, perimetro;

    double CalcArea (){

        area = lado * lado;

        return area;
    }

    double CalcPerimetro(){

        perimetro = 4 * lado;

        return perimetro;
    }

    void print(){

        System.out.println("O quadrado que tem o lado de: "
                +lado+"\n Área: "+CalcArea()
                +"\nPerimetro: "+CalcPerimetro());
    }

    void construtor(){
    System.out.println("Informe o valor do lado do quadrado:");
    lado = inicio.nextDouble();
    }
}