/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio22dez2015;

/**
 *
 * @author adrianonef
 */
public class uri1002 {
    public static void main(String[] args) {
        double raio;
        double pi= 3.14159;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        raio = interatividade.teclado.nextDouble();
        System.out.println("A = "+(pi*Math.pow(raio,2)));
        
    }
    
}
