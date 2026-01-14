
package lab;

import java.util.Scanner;

public class Lab4 {
    public static void main (String[] args){
         
    // Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
    // segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com um numero Inteiro: ");
        int n1 = sc.nextInt();
        
        String impossivel = "";
        double[] total = new double[n1];
        
        for (int i = 0; i < n1; i++) {
            
            double divisao[] = new double[2];
            
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite um numero inteiro: ");
                divisao[j] = sc.nextInt();

             }
            
            if(divisao[1] != 0){
                total[i] = divisao[0]/ divisao[1];
            }else{
                total[i] = Double.NaN;
            }
                
       }
        
        for(int i = 0; i< total.length;i++){
            if(Double.isNaN(total[i])){
                System.out.println("Impossivel Dividir");
            }else{
                System.out.printf("%.1f\n", total[i]);
            }
            
        }
        
    }
}
