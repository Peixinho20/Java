package entidades;

public class Produto {

    //atributos da classe
    public String nome, descricao;
    public double preco;
    public int quantidade;
    public boolean disponivelParaVenda;

    //Construtor da classe que obriga ao programdor inserir dados dos produtos

    //métodos da classe
    public double valorTotalEmEstoque() {
	return preco * quantidade;
    }

    public void adicionarProduto(int quantidade) {
	this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
	this.quantidade += quantidade;
    }

    public String toString() {
	return nome
	    + ", $ "
    	    + String.format("%.2f", preco)
	    + ", "
	    + quantidade
	    + " unidades, Total: $ "
	    + String.format("%.2f", valorTotalEmEstoque());
    }
}
