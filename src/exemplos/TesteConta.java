package exemplos;

public class TesteConta {

        public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(200);
        c.depositar(2000);
            System.out.println("Saldo: " + c.saldo);
        
    }

}
