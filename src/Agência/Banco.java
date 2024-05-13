package Agência;
import java.util.ArrayList;
import java.util.List;

import Agência.Clientes.Cliente;

public class Banco {

    private String nomeBanco;
    List<Cliente> listaClientes;

    public Banco() {
        this.listaClientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        this.listaClientes.add(cliente);
    }
    public void listaClientes(){
        System.out.println(listaClientes);
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    

}
