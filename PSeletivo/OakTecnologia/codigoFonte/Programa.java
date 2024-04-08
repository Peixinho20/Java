import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa {
	//Declaração de lista de produtos como uma varável de instancia
    private static List<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args){
		//Locale.setDefault(Locale.BR);
		Scanner sc = new Scanner(System.in);
	 	
	 	boolean continuar = true;
	 	
	 	while(continuar) {	
	 		exibirMenu();   
		
			int opcao = sc.nextInt(); 
			
			sc.nextLine();  //Consumo de quebra de linha pendente 
			
			switch (opcao) {
				case 1:
					//listarProdutos();
					cadastrarProdutos(sc);	
					listarProdutos();
					break;
					
				case 2: //Apenas ver a lista de produtos cadastrados
					listarProdutos();
					break;
					
				case 3:
					System.out.println("Finalizando o programa... FIM!");
					continuar = false;
					break;
					
				default: 
					System.out.println("Valor inválido");
					//inserir uma condição para tentar de novo
					break;
			} 
		}	

		sc.close();
    }
    
    //Métodos
    
    private static void exibirMenu(){
		//System.out.println("\n...........................................");
    	System.out.println("Bem vindo(a) ao sistema de gerenciamento de produtos!");
		System.out.println("\nEscolha uma opção: " 
			+"\n[1] Para cadastrar um produto. "
			+"\n[2] Para ver a lista de produtos cadastrados. "
			+"\n[3] Para finalizar o programa."
			+"\n ...........................................");
    }
    
    private static void cadastrarProdutos(Scanner sc){
        boolean continuar = true;
        
        while(continuar) {
		//Inserção dos dados do produto
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("                 CADASTRO");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
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
				
		listaProdutos.add(produto);
				    
		System.out.println("Produto cadastrado com sucesso!");
		
		System.out.println("....................................");

		//System.out.println("Produto recém cadastrados");
					
		System.out.println("Dados do Produto: " + produto);	        
				
		System.out.print("Quer continuar cadastrando produtos? (sim/nao): ");
        String resposta = sc.next();
                    
        continuar = resposta.equalsIgnoreCase("sim");
        sc.nextLine(); // Consumo de quebra de linha pendente	
                
        }
    }
    
    private static void listarProdutos(){
    	if(listaProdutos.isEmpty()){
    		System.out.println("\nListagem vazia");    	
    	}else{
    		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    		System.out.println("                LISTAGEM:");
    		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			for(Produto p : listaProdutos){
				System.out.println("Nome: "+ p.getNome() + " | Preço: " + p.getPreco());
			}
			//System.out.println("....................................");
    	}
    }
}    
    
    
