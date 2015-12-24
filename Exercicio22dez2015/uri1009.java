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
public class uri1009 {
    public static void main(String[] args) {
        String NAME;
        double SALARY,SALES;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteNome();
        NAME = interatividade.teclado.next();
        interatividade.digiteValor();
        SALARY = interatividade.teclado.nextDouble();
        interatividade.digiteValor();
        SALES = interatividade.teclado.nextDouble();
        
        SALARY = SALARY + (SALES * 0.15);
        System.out.println(NAME+" SALARY = "+SALARY);
    }
        
}
