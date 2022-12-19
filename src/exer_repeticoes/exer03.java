package exer_repeticoes;

import java.util.Scanner;

public class exer03 {

// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
// idade for =-99. (WHILE)

     
    public static void main(String[] args) {
        
        int idade = 0, menor = 0, maior = 0;
        Scanner entrada = new Scanner (System.in);
        
        while (idade != -99) { 
            System.out.println("Qual sua idade? ");  
            idade = entrada.nextInt(); 
            
            if(idade < 21 && idade > 0) {
                menor++;                
            }
            
            else if (idade > 50) {
                maior++;
            }
            
            System.out.println("Use '-99' para encerrar.");
        }
        
        System.out.println("O total de pessoas com idade abaixo de 21 anos é " + menor);
        System.out.println("O total de pessoas com idade acima de 50 anos é "+ maior);
        
    }

}