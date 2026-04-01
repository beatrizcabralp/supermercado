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

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = dados.nextLine();

        System.out.print("Digite o código de barras: ");
        int codigo = dados.nextInt();

        System.out.print("Digite o preco base: ");
        double preco = dados.nextDouble();
        dados.nextLine();

        System.out.print("Digite a porcentagem de acréscimo (%): ");
        double taxa = dados.nextDouble();

        fornecedor.exibirDetalhesFornecedor();

        Produto produto = new filha(nomeProduto, codigo, preco, fornecedor, taxa);

        produto.exibirResumo();
        System.out.println("Preço final: " + produto.calcularPrecoFinal());

        dados.close();
    }
}
