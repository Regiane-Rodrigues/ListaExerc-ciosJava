/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author aluno
 */
public class BubbleSort implements Ordenavel {

    @Override
    public void ordenar(int[] bubbleSort) {
        int aux = bubbleSort.length;
        for (int i = 0; i < aux - 1; i++) {
            for (int j = 0; j < aux - i - 1; j++) {
                if (bubbleSort[j] > bubbleSort[j + 1]) {
                    // Troca os elementos de posição
                    int temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j + 1];
                    bubbleSort[j + 1] = temp;
                }
            }
        }

        for (int num : bubbleSort) {
            System.out.println(num);
        }
    }

   
}
