public class filha extends Produto {

    private double taxa; // porcentagem

    public filha(String nome, int codigoBarras, double precoBase, fornecedor fornecedor, double taxa) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * (1 + taxa / 100);
    }
}