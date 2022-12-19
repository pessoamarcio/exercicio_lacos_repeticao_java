package exer_repeticoes;

import java.util.Scanner; // importa a classe Scanner para ler entradas do teclado

public class exer06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    int num, count = 0;
    double soma = 0;
    do {
      System.out.print("Digite um número (ou 0 para sair): ");
      num = scanner.nextInt(); 
      if (num % 3 == 0 && num != 0) { 
        count++; 
        soma += num;
      }
    } while (num != 0); 

    if (count > 0) { 
      double average = soma / count; 
      System.out.println("Média dos números múltiplos de 3 é: " + average);
    } else {
      System.out.println("Nenhum número múltiplo de 3 foi digitado.");
    }
  }
}