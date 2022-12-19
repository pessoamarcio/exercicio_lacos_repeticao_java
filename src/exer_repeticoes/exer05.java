package exer_repeticoes;

import java.util.Scanner;

public class exer05 {

	//Crie um programa que leia um número do teclado até que encontre um
	//número igual a zero. No final, mostre a soma dos números
	//digitados.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			soma += numero;
			soma = soma + numero;
			}
		while(numero!= 0);
		System.out.println("A soma de dos números digitados é " + soma);
	}

}