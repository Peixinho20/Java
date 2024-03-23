/*
Fazer um programa para ler um número inteiro N e os dados (nome e preco) de N produtos
(indica que requer uma classe do tipo produto).
Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio deos produtos.
*/


import java.util.Locale;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	/*
	Criacao do vetor do tipo referencia (vetor vet do tipo produto recebendo n elementos)
	vet sendo criado com todas as posiçoes nulas, nese caso é preciso instanciar um produto
	e fazer com que as posicoes apontem para esses objetos.
	*/
	Produto[] vet = new Produto[n];

	for(int i=0; i<n; i++){
	    sc.nextLine();
	    String name = sc.nextLine();
	    double price = sc.nextDouble();
	    vet[i] = new Produto(name, price);
	}

	double sum = 0.0;
	for(int i =0; i<n; i++){
	    sum += vet[i].getPrice();
	}

	double media = sum/n;

	System.out.printf("Media dos precos = %.2f%n", media);

        sc.close();
    }

}
