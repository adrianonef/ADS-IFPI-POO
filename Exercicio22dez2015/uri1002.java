/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio22dez2015;

/**
 *
 * @author adrianonef
 */
public class uri1002 {
    public static void main(String[] args) {
        double raio;
        double pi= 3.14159;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        raio = interatividade.teclado.nextDouble();
        System.out.println("A = "+(pi*Math.pow(raio,2)));
        
    }
    
}
