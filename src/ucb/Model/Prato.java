package ucb.Model;

/**
 * Padrão GRASP: Information Expert (Especialista na Informação)
 *
 * Justificativa: A classe 'Prato' é a especialista em conhecer
 * seus próprios dados (nome e ingredientes). Em vez de outra classe
 * consultar (get) os dados e manipulá-los, a classe 'Prato'
 * centraliza e protege suas próprias informações.
 *
 * Onde: A classe inteira.
 */

public class Prato {
    private String nome;
    private String ingredientes;

    public Prato(){}

    public Prato(String nome, String ingredientes){
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    // Métodos getters/setters são a manifestação do Information Expert,
    // pois a classe provê o acesso controlado à sua informação.
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