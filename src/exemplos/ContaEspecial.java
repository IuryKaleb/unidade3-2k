package exemplos;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial (int numero, String nometitular, double limite) {
        super(numero, nometitular);
        this.limite = limite;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
