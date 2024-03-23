import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa {
    public static void main(String[] args){
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

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
	System.out.print("Digite o numero de produtos a serem adicionados ao estoque0: ");
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

	sc.close();
    }
}
