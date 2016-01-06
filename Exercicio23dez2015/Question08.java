/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Question08 {
        public static void main(String[] args) {
        Interatividade interatividade = new Interatividade();
        int number = 1, counterNumber = 0, amontNumber = 0;
        float pontoFlutuante;
        while (number > 0){
            
            interatividade.digiteValor();
            number = interatividade.teclado.nextInt();
            if(number > 0)amontNumber = amontNumber + number;
            ++counterNumber;
        }
        counterNumber--;
        System.out.println(amontNumber/counterNumber);
    }
    
}
