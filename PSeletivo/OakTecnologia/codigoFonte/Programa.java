import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa {
    public static void main(String[] args){
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//List listaProdutos = new ArrayList<>();
 	
	System.out.println("Bem vindo(a) ao sistema de gerenciamento de produtos!");
	System.out.println("Escolha uma opção: " 
	    +"\n[1] Para cadastrar um produto. "
	    +"\n[2] Para ver a lista de produtos cadastrados. "
	    +"\n[3] Para finalizar o programa.");
	       
	int opcao = sc.nextInt(); 
	
	sc.nextLine();  //Consumo de quebra de linha pendente 
	
	switch (opcao) {
		//String continuar;
	    case 1: //Cadastrando um produto
	    	
			boolean continuar = true;
	       	while(continuar) {
				//Inserção dos dados do produto
				System.out.println("Entre com os dados do produto: ");
				System.out.print("Nome: ");
				String nome = sc.nextLine();		
				
				System.out.print("Descrição: ");
				String descricao = sc.nextLine();

				System.out.print("Preco: ");
				double preco = sc.nextDouble();
				
				//instanciação do produto
				Produto produto = new Produto(nome, preco);
				
				//implementar o item: Disponível para venda - campo com 2 opções: sim / não
				System.out.print("Disponível para venda (sim/não): ");
				String disponivel = sc.next();
				
				sc.nextLine();
				    
				// Conversao para booleano
				produto.disponivelParaVenda = disponivel.equalsIgnoreCase("sim"); 
				    
				System.out.println("Produto cadastrado com sucesso!");

				System.out.println("Lista de Produtos cadastrados");
					
				System.out.println("Dados dos Produtos: " + produto);	        
				
				System.out.print("Quer continuar cadastrando produtos (sim/não): ");
                String resposta = sc.next();
                    
                continuar = resposta.equalsIgnoreCase("sim");
                sc.nextLine(); // Consumo de quebra de linha pendente	
			}
				
	    	break;
	    	
	    case 2: //Apenas ver a lista de produtos cadastrados
	        System.out.println("Lista de Produtos cadastrados");
	        //for(Produto p : listaProdutos){
	            
	        //System.out.println("Nome: "+ p.nome + " | Preço: "+ p.preco);	        
	        //}
	        break;
	        
	    case 3:
	        System.out.println("Finalizando o programa...");
	        break;
	        
	    default: 
	    	System.out.println("Valor inválido");
	    	//inserir uma condição para tentar de novo
	    	break;
	} 

	sc.close();
    }
}
