public class Moto{
    private double Velocidade;
    private String descricao;
    private int ano, placa, potencia, valor;
    
    public Moto(double velocidade, String descricao, int ano, int placa, int potencia, int valor) {
        Velocidade = velocidade;
        this.descricao = descricao;
        this.ano = ano;
        this.placa = placa;
        this.potencia = potencia;
        this.valor = valor;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double velocidade) {
        Velocidade = velocidade;
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(Velocidade);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ano;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + placa;
        result = prime * result + potencia;
        result = prime * result + valor;
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
        Moto other = (Moto) obj;
        if (Double.doubleToLongBits(Velocidade) != Double.doubleToLongBits(other.Velocidade))
            return false;
        if (ano != other.ano)
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (placa != other.placa)
            return false;
        if (potencia != other.potencia)
            return false;
        if (valor != other.valor)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Moto [Velocidade=" + Velocidade + ", ano=" + ano + ", descricao=" + descricao + ", placa=" + placa
                + ", potencia=" + potencia + ", valor=" + valor + "]";
    }
 
    
}