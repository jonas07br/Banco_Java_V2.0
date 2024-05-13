public abstract class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 61;
    private static int numeral=1;
    
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
    public void transferir(double valor,IConta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    //getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInfosGerais(){
        System.out.println("Nome do Cliente:"+this.cliente.getNome());
        System.out.println("Agência:"+getAgencia());
        System.out.println("Nº da Conta:"+this.getNumConta());
        System.out.println("Saldo:"+this.getSaldo());
    }
    
    

    
}
