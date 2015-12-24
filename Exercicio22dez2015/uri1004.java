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
public class uri1004 {
    public static void main(String[] args) {
        int a,b,PROD;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        a = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        b = interatividade.teclado.nextInt();
        PROD = a*b;
        System.out.println("O Produto dos Valores = "+PROD);
    }
}
