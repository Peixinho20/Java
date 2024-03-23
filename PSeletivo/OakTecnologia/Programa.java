import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa {
    public static void main(String[] args){
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Bem vindo(a) ao sistema de gerenciamento de produtos!");
	System.out.println("Escolha uma opção: " 
	    +"\n[1] Para cadastrar um produto. "
	    +"\n[2] Para ver a lista de produtos cadastrados. "
	    +"\n[3] Para finalizar o programa.");
	    
	int opcao = sc.nextInt();    
	switch (opcao) {
	    case 1: //Cadastrando um produto
	    	
	    	//lista de produtos
	    	
	    	//instanciação do produto
	        Produto produto = new Produto();
	        
	        //Inserção dos dados do produto
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		sc.nextLine();//Consumo de linha pendente
		
		System.out.print("Descrição: ");
		produto.descricao = sc.nextLine();

		System.out.print("Preco: ");
		produto.preco = sc.nextDouble();
		
		//implementar o item: Disponível para venda - campo com 2 opções: sim / não
		System.out.print("Disponível para venda (sim/não): ");
                String disponivel = sc.next();
                produto.disponivelParaVenda = disponivel.equalsIgnoreCase("sim"); // Converte para booleano

		
		
	    	break;
	    	
	    case 2: //Apenas ver a lista de produtos cadastrados
	        System.out.println("Opçao1");
	        break;
	        
	    case 3:
	        System.out.println("Finalizando o programa...");
	        break;
	        
	    default: 
	    	System.out.println("Valor inválido");
	    	//inserir uma condição para tentar de novo
	    	break;
	} 
	  
	
	/*
	//instanciação do produto
	Produto produto = new Produto();

	//Inserção dos dados do produto
	System.out.println("Entre com os dados do produto: ");
	System.out.print("Nome: ");
	produto.nome = sc.nextLine();

	System.out.print("Preco: ");
	produto.preco = sc.nextDouble();

	System.out.print("Quantidade no estoque: ");
	produto.quantidade = sc.nextInt();

	System.out.println();
	System.out.println("Dados do produto: " + produto);

	System.out.println();
	System.out.print("Digite o numero de produtos a serem adicionados ao estoque: ");
	int quantidade = sc.nextInt();
	produto.adicionarProduto(quantidade);

	System.out.println();
	System.out.println("Atualização de dados: "+ produto);

	System.out.println();
	System.out.print("Digite o numero de produtos a serem removidos do estoque: ");
	quantidade = sc.nextInt();
	produto.removerProduto(quantidade);

	System.out.println();
	System.out.println("Atualização de dados: "+ produto);
	*/	

	sc.close();
    }
}
