package exemplos;

public class TesteConta {

        public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(200);
        c.depositar(2000);
        boolean saqueEfetuado = c.sacar (500);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("Saldo indisponível!!");;
        }
            System.out.println(saqueEfetuado);
            System.out.println("Saldo: " + c.saldo);
    }

}
