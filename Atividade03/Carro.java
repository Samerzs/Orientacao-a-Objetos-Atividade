package Atividade03;

public class Carro {

    private String modelo;
    private int velocidade;

    public Carro() {
        this.modelo = "Desconhecido";
        this.velocidade = 0;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


    public void acelerar(int incremento) {
        incremento = 10;
        if(incremento > 0) {
            this.velocidade += incremento;
        } else{
            System.out.println("Incremento deve ser positivo para o carro poder acelerar.");
        }
    }
    public void frear(int decremento) {
        decremento = 10;
        if(decremento > 0 && this.velocidade - decremento >= 0) {
            this.velocidade -= decremento;
        } else if (decremento > 0 && this.velocidade - decremento < 0) {
            System.out.println("O carro " + modelo + " não pode frear, velocidade não pode ser negativa.");
        } else {
            System.out.println("Decremento deve ser positivo para o carro poder frear.");
        }
        }
    public void exibirVelocidade() {

        System.out.println("Velocidade atual do carro " + modelo + ": " + velocidade + " km/h");

    }

}
