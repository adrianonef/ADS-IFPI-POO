/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;
/**
 *
 * @author adrianonef
 */
public class Question01 {
    public static void main(String[] args) {
        int x;
        float y;
        Interatividade interatividade = new Interatividade();

        interatividade.digiteValor();
        x = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        y = interatividade.teclado.nextFloat();
        System.out.println(interatividade.df.format(x/y)+" Km/l");
    }
}
