
package lab;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
     
    // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
    // Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
    // essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). 
        Scanner sc = new Scanner(System.in);
        
        int num2;
        int qtdIn = 0, qtdOut = 0;
        
        System.out.println("Entre com um numero Inteiro: ");
        int num = sc.nextInt();
        
        for(int i = 1; i<= num; i++){
            num2  = sc.nextInt();
            
            if(num2 >= 10 && num2 <= 20){
                qtdIn += 1;
            }else{
                qtdOut += 1;
            }
        }
        
        System.out.println(qtdIn + " in");
        System.out.println(qtdOut +" out");
        
    }
}
