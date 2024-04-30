package exemplos;

public class Conta {
    int numero;
    String nometitular;
    double saldo;
    
    void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }
}
