import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o nome da empresa: ");
        String nome = dados.nextLine();

        System.out.print("Digite o NIF: ");
        String nif = dados.nextLine();

        System.out.print("Digite o país de origem: ");
        String pais = dados.nextLine();

        fornecedor fornecedor = new fornecedor(nome, nif, pais);

        fornecedor.exibirDetalhesFornecedor();

        dados.close();
    }
}
