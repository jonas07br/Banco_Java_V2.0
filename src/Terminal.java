public class Terminal {
    public static void main(String[] args) {
        Banco bnb = new Banco();
        Cliente jonas = new Cliente("Jonas Rafael Silva Cavalcanti", 123123);
        
        bnb.addCliente(jonas);
        Conta cc = new ContaCorrente(jonas);
        Conta cp = new ContaPoupanca(jonas);

        cc.depositar(200);
        //cc.imprimirExtrato();

        cp.depositar(500);
        //cp.imprimirExtrato();

        cc.transferir(50, cp);

        //cc.imprimirExtrato();
        //cp.imprimirExtrato();
        bnb.listaClientes();
    }
}
