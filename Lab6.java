
package lab;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args){
        // Ler um numero inteiro e calcular todos os seus divisores
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com um numero Inteiro: ");
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println("Divisivel por: " + i);
            }
        }
        
    }
}
