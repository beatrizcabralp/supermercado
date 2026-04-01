public abstract class Produto {

    protected String nome;
    protected int codigoBarras;
    protected double precoBase;
    protected fornecedor fornecedor;

    public Produto(String nome, int codigoBarras, double precoBase, fornecedor fornecedor) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.precoBase = precoBase;
        this.fornecedor = fornecedor;
    }

    public abstract double calcularPrecoFinal();

    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço Base: " + precoBase);
    }

}
