/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
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
        System.out.printf( "Media %.5f", MEDIA ); 
    }
}