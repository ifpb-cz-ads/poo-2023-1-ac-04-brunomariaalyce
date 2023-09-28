package BatistaMoraes;

public class Lampada {
    private String marca;
    private double preco;
    private int potencia;
    private boolean ligada;

    public Lampada(String marca, double preco, int potencia) {
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.ligada = false;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean estaLigada() {
        return ligada;
    }
}
