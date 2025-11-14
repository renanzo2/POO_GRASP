import ucb.Controller.RepoPrato;
import ucb.Controller.RestauranteController;
import ucb.Model.Prato;

public class Main {
    public static void main(String[] args) {

        RepoPrato repositorio = new RepoPrato();
        RestauranteController controller = new RestauranteController(repositorio);

        System.out.println("--- Cadastro de Pratos ---");
        controller.criarNovoPrato("Feijoada", "Feijão preto, paio, carne seca");
        controller.criarNovoPrato("Pizza Margherita", "Molho, muçarela, manjericão");

        System.out.println("\n--- Pratos Cadastrados ---");
        for (Prato prato : repositorio.listarTodos()) {
            System.out.println("Nome: " + prato.getNome());
            System.out.println("Ingredientes: " + prato.getIngredientes());
            System.out.println("-----");
        }
    }
}