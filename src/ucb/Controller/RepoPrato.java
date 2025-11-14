package ucb.Controller;

import ucb.Model.Prato;
import java.util.ArrayList;
import java.util.List;

/**
 * Padrão GRASP: High Cohesion (Alta Coesão)
 *
 * Justificativa: A responsabilidade desta classe é única e bem definida:
 * gerenciar a coleção (lista) de objetos 'Prato'. Ela não se preocupa
 * em criar pratos (isso é feito pelo Controller) ou em exibir pratos
 * (isso é feito pela View, no caso, a 'Main'). Ela só faz o gerenciamento
 * da lista.
 *
 * Onde: A classe inteira 'RepoPrato'.
 *
 * ---
 *
 * Padrão GRASP: Information Expert (Especialista na Informação)
 *
 * Justificativa: Seguindo o mesmo princípio da classe 'Prato', a 'RepoPrato'
 * é a especialista em conhecer a lista 'pratosCadastrados'. Qualquer outra
 * classe que precise adicionar ou listar todos os pratos deve pedir
 * à 'RepoPrato', que encapsula a lógica de como a lista é implementada
 * (neste caso, um ArrayList).
 *
 * Onde: Nos métodos 'adicionarPrato' e 'listarTodos' que manipulam
 * a lista interna.
 */

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