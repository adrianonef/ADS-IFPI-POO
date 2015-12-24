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
public class uri1006 {
    public static void main(String[] args) { 
        double a,b,c,MEDIA;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        a = interatividade.teclado.nextDouble();
        interatividade.digiteValor();
        b = interatividade.teclado.nextDouble();
        interatividade.digiteValor();
        c = interatividade.teclado.nextDouble();
        MEDIA = ((a*2)+(b*3)+(c*5))/10;
        System.out.printf( "Media = "+"%.1f", MEDIA ); 
    }
}