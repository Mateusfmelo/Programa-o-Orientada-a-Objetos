public abstract class Automovel implements Veiculo{
    protected double valor;
    protected String descricao, placa;
    protected int ano, velocidade;
    
    public Automovel(int velocidade, double valor , String descricao, String placa, int ano) {
        this.velocidade = velocidade;
        this.valor = valor;
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    protected void acelerarCarroOuMoto (int velocidade) {
        if (this. velocidade <= 0){
            System.out.println("Valor não permitido");
        } else {
            this.velocidade += 10;
            System.out.println(this.velocidade);
    }
}

    protected void acelerarCaminhaoOuOnibus (int velocidade){
        if (this.velocidade <= 0){
            System.out.println("Valor não permitido");
        } else {
            this.velocidade += 8;
            System.out.println(this.velocidade);
        }
    }

    protected void frearCarroOuMoto (int velocidade) {
        if (this.velocidade <= 0){
            System.out.println("Valor não permitido");
        }  else {
            this.velocidade -= 10;
            System.out.println(this.velocidade);
        }
}

    protected void frearCaminhaoOuOnibus (int velocidade){
        if (this.velocidade <= 0){
            System.out.println("Valor não permitido");
        } else {
            this.velocidade -= 8;
            System.out.println(this.velocidade);
        }
    }
}