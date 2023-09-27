package CarvalhoTeixeira;

public class Conta implements IConta {
    private String nomeTitular;
    private int numero;
    private double saldo;

    public Conta(String nomeTitular, int numero, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta [nomeTitular=" + nomeTitular + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}