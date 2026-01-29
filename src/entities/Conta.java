package entities;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double valor;

    public Conta() {
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroConta, String nomeTitular, double valorInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(valorInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorInicial() {
        return valor;
    }

    public void depositar(double qtd) {
        valor += qtd;
    }

    public void sacar(double qtd) {
        valor -= qtd + 5.0;
    }

    public String toString(){
        return "Conta " + numeroConta +", Titular: " + nomeTitular +", Total na Conta: " + String.format("%.2f", valor);
    }

}
