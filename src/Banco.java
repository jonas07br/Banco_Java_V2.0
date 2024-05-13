import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nomeBanco;
    List<Cliente> listaClientes;

    public Banco() {
        this.listaClientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        this.listaClientes.add(new Cliente());
    }
    public void listaClientes(){
        System.out.println(listaClientes);
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    

}
