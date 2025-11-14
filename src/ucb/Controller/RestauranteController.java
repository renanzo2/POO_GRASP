package ucb.Controller;

import ucb.Model.Prato;

public class RestauranteController {

    private RepoPrato meuRepositorio;

    public RestauranteController(RepoPrato repositorio) {
        this.meuRepositorio = repositorio;
    }

    public void criarNovoPrato(String nome, String ingredientes) {

        Prato novoPrato = new Prato();

        novoPrato.setNome(nome);
        novoPrato.setIngredientes(ingredientes);

        meuRepositorio.adicionarPrato(novoPrato);
    }
}