import java.io.IOException;

public class ExcecaoVerificada{

    public void f(int a) throws IOException {
        if (a<35) throw
            new IOException ("valor do argumento de f() é' " + a + " (menor que 35)");
            System.out.println("a = "+ a);
    }
}
