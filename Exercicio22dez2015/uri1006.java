/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
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