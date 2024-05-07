package exemplos;

public class Conta {
    private int numero = 364185;
    private String nometitular = "Iury Kaleb";
    private double saldo;
    
    public void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else
        return false;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero (int numero) {
        this.numero = numero;
    }

    public String getNometitular() {
        return nometitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nometitular = nomeTitular;       
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", nometitular=" + nometitular + ", saldo=" + saldo + '}';
    }
    
    
}
