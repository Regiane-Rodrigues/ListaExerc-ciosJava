/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *Crie uma interface chamada Ordenavel com um método ordenar() que recebe um array de inteiros
 * e o ordena em ordem crescente. Em seguida, implemente essa interface em uma classe chamada BubbleSort que 
 * implementa o algoritmo de ordenação Bubble Sort.
 * @author aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[] bubbleSort = {80, 20, 50, 40};
        
        BubbleSort bubble = new BubbleSort();
        bubble.ordenar(bubbleSort);
        
        for (int ordena : bubbleSort) {
            
            System.out.println(ordena);
        }
       

        
    }

   
}
