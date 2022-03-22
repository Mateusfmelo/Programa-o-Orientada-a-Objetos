public class Principal {
    public static void main(String[] args){

        CadastroBrinquedo Brinquedo = new CadastroBrinquedo(4);

        Carro car = new Carro(98, 99);
        Carro car1 = new Carro(69, 96);
        Barco boat = new Barco(72, 54);
        Aviao plane = new Aviao(17, 13);

        Brinquedo.adicionarBrinquedos(car);
        Brinquedo.adicionarBrinquedos(car1);
        Brinquedo.adicionarBrinquedos(boat);
        Brinquedo.adicionarBrinquedos(plane);

        Brinquedo.todoMundoSeMovendo();

        System.out.println("O polimorfismo é chamado na classe Principal, onde os métodos estão sendo importados de uma superclasse para subclasses, ainda que a identificação do método, nesse caso(mover) seja igual, possuem operações distintas para cada classe, caracterizando o polimorfismo.");
    }
}
