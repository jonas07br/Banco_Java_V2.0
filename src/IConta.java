public interface IConta {
    public void sacar(double valorSaque);
    public void depositar(double valorDeposito);
    public void transferir(double valor);
    public void imprimirExtrato();
}
