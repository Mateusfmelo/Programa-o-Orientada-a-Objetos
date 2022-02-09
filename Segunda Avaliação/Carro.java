public class Carro {
    private double velocidade;
    private String descricao;
    private int ano, valor, qtdeportas, potencia;
    
    public Carro(double velocidade, String descricao, int ano, int valor, int qtdeportas, int potencia) {
        this.velocidade = velocidade;
        this.descricao = descricao;
        this.ano = ano;
        this.valor = valor;
        this.qtdeportas = qtdeportas;
        this.potencia = potencia;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQtdeportas() {
        return qtdeportas;
    }

    public void setQtdeportas(int qtdeportas) {
        this.qtdeportas = qtdeportas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + potencia;
        result = prime * result + qtdeportas;
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
        Carro other = (Carro) obj;
        if (ano != other.ano)
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (potencia != other.potencia)
            return false;
        if (qtdeportas != other.qtdeportas)
            return false;
        if (valor != other.valor)
            return false;
        if (Double.doubleToLongBits(velocidade) != Double.doubleToLongBits(other.velocidade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", descricao=" + descricao + ", potencia=" + potencia + ", qtdeportas="
                + qtdeportas + ", valor=" + valor + ", velocidade=" + velocidade + "]";
    }

    
}
