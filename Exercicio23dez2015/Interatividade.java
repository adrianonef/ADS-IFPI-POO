/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author adrianonef
 */
public class Interatividade {
    Scanner teclado = new Scanner(System.in);
    
    public void digiteValor(){
        System.out.print("Digite um Valor: ");
    }
    public void digiteNome(){
        System.out.print("Digite um Nome: ");
    }
    DecimalFormat df = new DecimalFormat(".##");
    
    public int sumAllTest(Cobaia[] cobaias){
        int sum = 0;
        for( Cobaia cobaia : cobaias) sum = sum + cobaia.amontTest;
        return sum;
    }
    
    public int sumTestTypeN(String type, Cobaia[] cobaias){
        int sum = 0;
        for( Cobaia cobaia : cobaias){
            if (cobaia.type.equals(type)) sum = sum +cobaia.amontTest; 
        }
        return sum;
    }
    
}