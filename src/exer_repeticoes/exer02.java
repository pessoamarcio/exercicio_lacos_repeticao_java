package exer_repeticoes;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class exer02 {

	public static void main(String[] args) {
		Scanner parimpa = new Scanner(System.in);
		int numero, i, par = 0, impar = 0;
		
		for(i = 1; i < 10; i++) {
			System.out.println("Digite um número: ");
			numero = parimpa.nextInt();
			
			if(numero % 2 == 0) {
				par = par +1;
			}
			else if (numero % 2 != 0){
				impar = impar +1;
			}
		}
		
	System.out.println("os números pares " + par);
	System.out.println("\nOs números impares "+ impar);
	}

}

