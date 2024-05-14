package exemplos;

public class ContaPoupanca extends Conta {
    public void reajustar (double percentual) {
        double saldoAtual = this.getSaldo();
        double juros = saldoAtual * percentual / 100;
        this.depositar(juros);
    }
    
    public ContaPoupanca (int numero, String nometitular) {
        super(numero, nometitular);     
        
    }
    

}
