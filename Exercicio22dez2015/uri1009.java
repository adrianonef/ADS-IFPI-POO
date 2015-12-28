/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
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
        
        SALARY = SALARY + (SALES * 0.02);
        System.out.println(NAME+" SALARY = "+SALARY);
    }
        
}
