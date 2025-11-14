import ucb.Controller.RepoPrato;
import ucb.Controller.RestauranteController;
import ucb.Model.Prato;

public class Main {
    public static void main(String[] args) {
        // A 'Main' é responsável por "montar" a aplicação,
        // criando o repositório e injetando-o no controlador.
        RepoPrato repositorio = new RepoPrato();
        RestauranteController controller = new RestauranteController(repositorio);

        System.out.println("--- Cadastro de Pratos ---");
        /**
         * Padrão GRASP: Controller (em ação)
         *
         * Justificativa: A 'Main' (View) não sabe como um prato
         * é criado ou salvo. Ela apenas envia os dados brutos
         * ("Feijoada", "Feijão...") para o 'RestauranteController'
         * e confia que ele fará o trabalho. Isso mantém a 'Main'
         * simples e focada apenas na interação com o usuário.
         */
        controller.criarNovoPrato("Feijoada", "Feijão preto, paio, carne seca");
        controller.criarNovoPrato("Pizza Margherita", "Molho, muçarela, manjericão");

        System.out.println("\n--- Pratos Cadastrados ---");
        // Nota: Idealmente, a 'Main' também pediria os pratos
        // ao 'controller' (ex: controller.getPratos()) para manter
        // o Baixo Acoplamento. Falar direto com o 'repositorio'
        // "fura" um pouco o encapsulamento do controlador,
        // mas para este exemplo, o foco está na criação.
        for (Prato prato : repositorio.listarTodos()) {
            System.out.println("Nome: " + prato.getNome());
            System.out.println("Ingredientes: " + prato.getIngredientes());
            System.out.println("-----");
        }
    }
}