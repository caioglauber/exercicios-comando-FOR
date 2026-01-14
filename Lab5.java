
package lab;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args){
        
    // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
    // Lembrando que, por definição, fatorial de 0 é 1. 
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com um numero Inteiro: ");
        int num = sc.nextInt();
        int fat = 1;
        
        for(int i = num; i > 1; i--){
            
            fat = fat * i;
            
            System.out.print(i + " x ");
            
        }
        System.out.println(" 1 = " + fat);
        
    }
}
