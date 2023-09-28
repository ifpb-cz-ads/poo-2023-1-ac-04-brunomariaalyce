package BatistaMoraes;

public class ContaSimplificada {
    private String titular;
    private double saldo = 0.0d;
    private int numeroConta;
    private String tipoConta;

    public void mostraDados() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Nome do titular: " + titular);
        System.out.println("Saldo: " + saldo);

        if (tipoConta.equals("especial") && saldo < 0) {
            System.out.println("ALERTA: Saldo negativo em conta especial!");
        }
    }

}
