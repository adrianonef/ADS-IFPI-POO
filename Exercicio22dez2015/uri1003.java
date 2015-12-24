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
public class uri1003 {
    public static void main(String[] args) {
        int a,b,soma;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        a = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        b = interatividade.teclado.nextInt();
        soma = a+b;
        System.out.println("A Soma dos Valores = "+soma);
    }
}
