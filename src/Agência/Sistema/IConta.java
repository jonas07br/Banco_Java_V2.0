package Agência.Sistema;
public interface IConta {
    void sacar(double valorSaque);
    void depositar(double valorDeposito);
    void transferir(double valor,IConta contaDestino);
    void imprimirExtrato();
}
