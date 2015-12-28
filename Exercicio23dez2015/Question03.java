/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Question03 {
    public static void main(String[] args) {
        int A,B,C,D;
        Interatividade interatividade = new Interatividade();
        
        interatividade.digiteValor();
        A = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        B = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        C = interatividade.teclado.nextInt();
        interatividade.digiteValor();
        D = interatividade.teclado.nextInt();
        if ( B>C && D>A && C+D > A+B && C>0 && D>0 && A%2==0 ){
            System.out.println("Valores aceitos");
        }else System.out.println("Valores nao aceitos");
        
    }
}
