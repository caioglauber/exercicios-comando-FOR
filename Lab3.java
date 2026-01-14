
package lab;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        
        //  Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
        // de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
        // conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
        // peso 5.
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Entre com um numero Inteiro: ");
         int num = sc.nextInt();
         
         double[] notas = new double[num];
         double[] media = new double[num];
         double[] peso = {2,3,5};
         
         
         for (int j = 0; j < num; j++) {
             double somaPonderada = 0;
             
            for (int i = 0; i < num; i++) {
                System.out.print("Entre com o "+ (i +1) + " numero: ");
                notas[i] = sc.nextDouble();
                
                somaPonderada += notas[i] * peso[i];
            }
            media[j] = somaPonderada / 10;
        }
         
         for(int i = 0; i < media.length; i++){
             System.out.printf("%.2f\n", media[i]);
         }
    }

}
