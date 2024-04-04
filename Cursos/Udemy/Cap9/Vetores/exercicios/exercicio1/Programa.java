/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e 
depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar 
na tela todos os números negativos lidos.
*/

import java.util.Scanner;
import java.util.Locale;

public class Programa {
    public static void main(String[] args){

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite um inteiro:");
	int n = sc.nextInt();

	System.out.printf("Digite %d medida(s):%n",n);
	int[] vect = new int[n];

	for(int i=0; i<vect.length; i++){
	    vect[i]=sc.nextInt();
	}

	System.out.println("Numeros negativos:");
	for(int i=0; i<vect.length; i++){
	    if(vect[i]<0){
		System.out.printf("%d%n",vect[i]);
	    }
	}

	sc.close();
    }
}
