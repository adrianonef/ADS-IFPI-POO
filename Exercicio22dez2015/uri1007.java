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
public class uri1007 {
    public static void main(String[] args) {
        int a,b,c,d;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        a = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        b = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        c = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        d = interatividade.teclado.nextInt();
        System.out.println("Diferença = "+ ((a*b)-(c*d)));
    }
    
}
