package Agência.Sistema.ContasTipo;
import Agência.Clientes.Cliente;
import Agência.Sistema.Conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente.");
        super.imprimirInfosGerais();
        
    }

}
