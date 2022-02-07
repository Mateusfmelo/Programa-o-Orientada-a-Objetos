class Main{
    public static void main(String[] args) {
        // criar objetos
        Televisor minhaTv = new Televisor(10, 10, false);

        ControleRemoto controle = new ControleRemoto (minhaTv);

        // invocar métodos disponíveis na classe Televisor
        minhaTv. ligar();
        minhaTv.aumentarVolume();
        minhaTv.trocarCanal(20);
        System.out.println(minhaTv.toString());
        minhaTv.desligar();
        System.out.println(minhaTv.toString());

        // invocar métodos disponíveis na classe controleremoto
        controle.ligar();
        controle.aumentarVolume();
        controle.trocarCanal(10);
        System.out.println(controle.toString());
        controle.desligar();
        System.out.println(controle.toString());
    }  
}
