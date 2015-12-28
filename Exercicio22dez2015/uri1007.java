/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
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
