/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Question04 {
    public static void main(String[] args) {
        int N,writeNumbers = 1;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        N = interatividade.teclado.nextInt();
        for (int i = 0; (i < N); i++){
            System.out.println( writeNumbers++ +" "+ writeNumbers++ +" "+ writeNumbers++ + " IFPI");
            writeNumbers++;
        }
    }
}
