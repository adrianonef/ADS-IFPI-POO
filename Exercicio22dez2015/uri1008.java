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
public class uri1008 {
    public static void main(String[] args) {
        int NUMBER;
        float SALARY;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        NUMBER = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        SALARY = interatividade.teclado.nextFloat();
        interatividade.digiteValor();
        SALARY = SALARY * interatividade.teclado.nextFloat();
        System.out.println("NUMBER = "+NUMBER+"\nSALARY = "+SALARY);
    }
    
}
