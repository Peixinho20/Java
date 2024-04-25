import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Produto;

public class Programa {
	//Declaração de lista de produtos como uma varável de instancia
    private static ArrayList<Produto> listaProdutos = new ArrayList<>();

@SuppressWarnings("unchecked")
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//Desserialização 
		ObjectInputStream ois = null;
		
		try{
			ois = new ObjectInputStream(new FileInputStream("Programa.bin"));
			listaProdutos = (ArrayList)ois.readObject();
			System.out.println(listaProdutos);
			ois.close();
		
		}catch (ClassNotFoundException e){
			System.out.println("Arquivo não existe");
		
		}catch(IOException e1) {
			System.out.println("Erro na Desserialização");
		}
		
		//Início do programa
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
					
		System.out.println("Dados do Produto: " + produto);	        
				
		System.out.print("Quer continuar cadastrando produtos? (sim/nao): ");
        String resposta = sc.next();
                    
        continuar = resposta.equalsIgnoreCase("sim");
        sc.nextLine(); // Consumo de quebra de linha pendente	
                
        }
    }
    
    private static void listarProdutos(){
    	
    	//Serialização
    	ObjectOutputStream oos = null;
		
		try {		
			oos = new ObjectOutputStream(new FileOutputStream("Programa.bin"));
			oos.writeObject(listaProdutos);
			oos.close();
		}catch (IOException e){
			System.out.println("Erro na Serialização");
		}
		
    	//Função listarProdutos()
    	if(listaProdutos.isEmpty()){
    		System.out.println("\nListagem vazia\n");    	
    	}else{
    		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    		System.out.println("                LISTAGEM:");
    		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			for(Produto p : listaProdutos){
				System.out.println("Nome: "+ p.getNome() + " | Preço: " + p.getPreco()+"\n");
			}	
    	}
    }
}    
   
   
   
   




