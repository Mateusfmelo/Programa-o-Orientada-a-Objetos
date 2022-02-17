class Main {
    public static void main (String [] args){
        Competicao automoveis = new Competicao(4);

        Moto mm = new Moto(50, 15, "Nave", "MOC-2596", 2009, 200);
        Carro cc = new Carro(80, 20, "Esportivo", "POC-2000", 2022, 400, 3);
        Caminhao ca = new Caminhao(100, "Longo", "MUC-7895", 2021, 1000, 1500, 24);
        Onibus oo = new Onibus(40, 7800, 74, "leve", "PSG-2022", 1994, 24);

        automoveis.adicionarVeiculos(mm);
        automoveis.adicionarVeiculos(cc);
        automoveis.adicionarVeiculos(ca);
        automoveis.adicionarVeiculos(oo);

        automoveis.acelerarTodos();

        automoveis.listarTodos();

        automoveis.frearTodos();

        System.out.println("Nesse caso, o polimorfismo está acontecendo no main, onde os métodos estão sendo importados de outras classes.");
    }
}