/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Question07 {
    public static void main(String[] args) {
        Interatividade interatividade = new Interatividade();
        int numberSlug = 1, speedSlug, fastSlug = 0;
        
        while (numberSlug > 0){
            interatividade.digiteValor();
            numberSlug = interatividade.teclado.nextInt();
            for(int counter = 0;counter < numberSlug; counter++){
                interatividade.digiteValor();
                speedSlug = interatividade.teclado.nextInt();
                fastSlug = speedSlug > fastSlug ? speedSlug : fastSlug;
            }
        }
        if (fastSlug < 10)System.out.println("1");
        if (fastSlug < 20 && fastSlug > 9)System.out.println("2");
        if (fastSlug > 19)System.out.println("3");
    }
}
