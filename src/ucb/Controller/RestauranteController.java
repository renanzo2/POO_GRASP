package ucb.Controller;

import ucb.Model.Prato;

/**
 * Padrão GRASP: Controller (Controlador)
 *
 * Justificativa: Esta classe age como o ponto de entrada para a lógica
 * de negócio (casos de uso) vinda da camada de "View" (a classe 'Main').
 * Ela recebe a requisição ("criar um novo prato") e coordena as ações
 * necessárias, delegando o trabalho para as classes de domínio (Prato)
 * e de persistência (RepoPrato). Isso evita que a 'Main' tenha que
 * conhecer toda a lógica de criação e salvamento.
 *
 * Onde: A classe 'RestauranteController' inteira.
 *
 * ---
 *
 * Padrão GRASP: Low Coupling (Baixo Acoplamento)
 *
 * Justificativa: O controlador depende de 'RepoPrato', mas não é ele
 * quem o cria. Ele recebe o 'RepoPrato' pronto em seu construtor
 * (isso é chamado de Injeção de Dependência). Isso desacopla o
 * controlador da implementação concreta do repositório, tornando o
 * código mais flexível e testável.
 *
 * Onde: No construtor 'RestauranteController(RepoPrato repositorio)'.
 */

public class RestauranteController {

    private RepoPrato meuRepositorio;

    public RestauranteController(RepoPrato repositorio) {
        this.meuRepositorio = repositorio;
    }

    /**
     * Padrão GRASP: Creator (Criador)
     *
     * Justificativa: O controlador está criando instâncias da classe 'Prato'.
     * Isso faz sentido aqui porque o 'RestauranteController' "contém" ou
     * "agrega" os objetos 'Prato' (através do repositório) e ele
     * possui os dados de inicialização (nome, ingredientes) que vêm
     * da camada de View. Portanto, ele é um candidato natural para
     * ser o criador.
     *
     * Onde: No método 'criarNovoPrato'.
     */
    public void criarNovoPrato(String nome, String ingredientes) {
        // 1. Criação do objeto (Creator)
        Prato novoPrato = new Prato();
        // 2. Uso do Information Expert (Prato) para definir seus dados
        novoPrato.setNome(nome);
        novoPrato.setIngredientes(ingredientes);
        // 3. Delegação para o Repositório (Controller e Low Coupling)
        meuRepositorio.adicionarPrato(novoPrato);
    }
}