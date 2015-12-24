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
public class uri1005 {
    public static void main(String[] args) {
        double a,b,MEDIA;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        a = interatividade.teclado.nextDouble();
        interatividade.digiteValor();
        b = interatividade.teclado.nextDouble();
        MEDIA = ((a*3.5)+(b*7.5))/11;
        System.out.printf( "Media = "+"%.5f", MEDIA ); 
    }
}