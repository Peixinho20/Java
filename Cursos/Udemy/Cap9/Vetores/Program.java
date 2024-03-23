/**
Programa sobre alocar um vetor e preenchê-lo a partir de medidas lidas pelo teclado
**/
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite um inteiro: ");
	int n = sc.nextInt();

	System.out.printf("Digite %d medida(s):%n", n);
	double[] vect = new double[n];

	for (int i=0; i<n; i++){
	    vect[i] = sc.nextDouble();
	}

	double sum = 0.0;

	for(int i=0; i<n; i++){
	    sum += vect[i];
	}
	double media = sum/n;

	System.out.printf("Media de altura: %.2f%n", media);

	sc.close();
    }
}
