/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício1;

/**
 *1 - Crie uma interface chamada Desenhavel com um método desenhar() que não retorna nada. 
 * Em seguida, implemente essa interface em três classes diferentes: Circulo, Retangulo e Triangulo.
 * Cada classe deve implementar o método desenhar() para exibir o nome da forma geométrica correspondente.
 * @author aluno
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Desenhavel desenho1 = new Circulo();
        desenho1.desenhar();
        Desenhavel desenho2 = new Triangulo();
        desenho2.desenhar();
        Desenhavel desenho3 = new Retangulo();
        desenho3.desenhar();
    
           
    }
    
}
