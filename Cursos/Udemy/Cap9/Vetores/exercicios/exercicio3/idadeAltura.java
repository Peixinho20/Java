/*
Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/

import java.util.Scanner;
import java.util.Locale;

public class idadeAltura{
	public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int i;
	
	System.out.println("Quantos pessoas serão digitadas:");
	int n = sc.nextInt();
	
	String[] nomes = new String[n];
	int[] idades = new int[n];
	double[] alturas =new double[n];
		
	for(i=0; i<n; i++){
		System.out.printf("Dados da %da pessoa: \n", i+1);
		
		System.out.print("Nome: ");
		nomes[i] = sc.next();
		
		System.out.print("Idade: ");
		idades[i] = sc.nextInt();
		
		System.out.print("Altura: ");
		altura[i] = sc.nextDouble();
	}
	
	sc.close();
	}
}
