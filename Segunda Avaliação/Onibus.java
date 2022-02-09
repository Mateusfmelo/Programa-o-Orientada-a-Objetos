public class Onibus {
    private double velocidade;
    private String descricao;
    private int ano, placa, valor, comprimento, capacidadepassageiro;
    
    public Onibus(double velocidade, String descricao, int ano, int placa, int valor, int comprimento,
            int capacidadepassageiro) {
        this.velocidade = velocidade;
        this.descricao = descricao;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
        this.comprimento = comprimento;
        this.capacidadepassageiro = capacidadepassageiro;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getCapacidadepassageiro() {
        return capacidadepassageiro;
    }

    public void setCapacidadepassageiro(int capacidadepassageiro) {
        this.capacidadepassageiro = capacidadepassageiro;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + capacidadepassageiro;
        result = prime * result + comprimento;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + placa;
        result = prime * result + valor;
        long temp;
        temp = Double.doubleToLongBits(velocidade);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Onibus other = (Onibus) obj;
        if (ano != other.ano)
            return false;
        if (capacidadepassageiro != other.capacidadepassageiro)
            return false;
        if (comprimento != other.comprimento)
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (placa != other.placa)
            return false;
        if (valor != other.valor)
            return false;
        if (Double.doubleToLongBits(velocidade) != Double.doubleToLongBits(other.velocidade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Onibus [ano=" + ano + ", capacidadepassageiro=" + capacidadepassageiro + ", comprimento=" + comprimento
                + ", descricao=" + descricao + ", placa=" + placa + ", valor=" + valor + ", velocidade=" + velocidade
                + "]";
    }

    
}
