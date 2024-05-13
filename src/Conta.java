public abstract class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 61;
    private static int numeral;
    
    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

    //Constructor
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numConta = numeral++;
        this.cliente = cliente;
        this.saldo=0;
    }

    //funcoes implementadas
    public void sacar(double valorSaque){
        saldo-=valorSaque;
    }
    public void depositar(double valorDeposito){
        saldo +=valorDeposito;
    }
    public void transferir(double valor){
        this.sacar(valor);
    }
    
    

    
}
