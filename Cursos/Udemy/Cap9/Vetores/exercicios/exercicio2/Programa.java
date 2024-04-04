/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/

import java.util.Scanner;
import java.util.Locale;

public class Programa{
    public static void main (String[] args){
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    //declaração de variáveis
    int i;
    double soma, media;
    
    //leitura de valores
    System.out.println("Quantos numeros voce vai digitar: ");  
    int n = sc.nextInt();
    
    //alocação de memoria e armazenamento de valores
    double[] vet = new double[n];
    for(i=0; i<n; i++){
    	System.out.println("Digite um valor: ");
    	vet[i] = sc.nextDouble();
    }
    
    //exibição de valores
    System.out.print("Valores: ");
	for(i=0; i<n; i++) {
		System.out.printf("%.1f  ", vet[i]);
	}   
    
    soma=0;
    for(i=0; i<n; i++){
    	soma += vet[i];
    }
    System.out.printf("\nSoma = %.2f",soma);
    
    media = soma/n;
    
    System.out.printf("\nMedia = %.2f", media);
    
    sc.close();  
    }
}
