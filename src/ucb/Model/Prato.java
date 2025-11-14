package ucb.Model;

public class Prato {
    private String nome;
    private String ingredientes;

    public Prato(){}

    public Prato(String nome, String ingredientes){
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getIngredientes(){
        return ingredientes;
    }
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
}