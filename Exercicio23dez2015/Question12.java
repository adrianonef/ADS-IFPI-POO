/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

import java.util.Scanner;

/**
 *
 * @author adrianonef
 */
public class Question12 {
    public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		double soma = 0;
		while (i < 2){
			double nota = scanner.nextDouble();
			if (nota >= 0.0 && nota <= 10.0){
				i++;
				soma += nota;
			}else{
				System.out.println("Nota\tInvalida");
			}
		}
		double media = soma / 2.0;
		System.out.format("MEDIA = %.2f", media);
	}
}
