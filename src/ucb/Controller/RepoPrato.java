package ucb.Controller;

import ucb.Model.Prato;
import java.util.ArrayList;
import java.util.List;

public class RepoPrato {

    private List<Prato> pratosCadastrados = new ArrayList<>();

    public void adicionarPrato(Prato prato) {
        this.pratosCadastrados.add(prato);
        System.out.println("Prato " + prato.getNome() + " adicionado!");
    }

    public List<Prato> listarTodos() {
        return this.pratosCadastrados;
    }
}