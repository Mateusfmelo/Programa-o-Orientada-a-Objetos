//Classe
public class bola {

    //Atributos
    private String fabricante;
    private String cor;
    private double peso;

    //Construtor
    public bola(String fabricante, String cor, double peso){
        this.fabricante = fabricante;
        this.cor = cor; 
        this.peso = peso;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getCor(){
        return cor;
        }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public double getPeso(){
        return peso;
        }
        
    public void setPeso(double peso){
        this.peso = peso;
    }
}
