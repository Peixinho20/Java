package entidades;

public class Produto {

    //atributos da classe
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    public boolean disponivelParaVenda;

    public Produto(String nome, double preco){
    	//parametro da classe recebe o paremtro do médoto
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome(){
		return nome;
	}	
	
	public void setNome(String nome){
		this.nome = nome;
	}	
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(){
		this.preco = preco;
	}

   
    public String toString() {
		return nome
	    	+ ", $ "
    	    + String.format("%.2f", preco);
    }
}
