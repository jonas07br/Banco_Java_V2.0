public class Cliente {

    private String nome;
    private int identidade;

    public Cliente(){
        this.nome = "Cliente da silva";
        this.identidade= 123123;
    }

    public Cliente(String nome, int identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    //SET'S------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    //GET'S-----------------------------------------
    public String getNome() {
        return nome;
    }
    public int getIdentidade() {
        return identidade;
    }
    //ToStringMethod
    public String toString() {
        return "Cliente [nome=" + nome + "]";
    }
    
    
}
