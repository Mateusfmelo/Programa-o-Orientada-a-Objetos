import java.util.Scanner;
public class Retangulo {

    Scanner inicio = new Scanner(System.in);
    double comprimento, largura, area, perimetro;

    double CalcularArea (){
        area = comprimento * largura;
        return area;
    }

    double CalcularPerimetro(){
        perimetro = (2 * comprimento) + (2 * largura);
        return perimetro;
    }

    void print(){

        System.out.println("O Retangulo tem comprimento de: ");
        System.out.println("O Retângulo tem largura de: "
                +area+"\n Área: "+CalcularArea()
                +"\nPerimetro: "+CalcularPerimetro());
    }

    void construtor(){
        System.out.println("Informe do valor do comprimento do retângulo");
        comprimento = inicio.nextDouble();
        System.out.println("Informe do valor da largura do retângulo");
        largura = inicio.nextDouble();
    }
}
