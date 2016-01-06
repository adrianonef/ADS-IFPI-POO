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
public class Question10 {
    public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int qtd = 0;
		for (int i = 0; i < 5; i++){
			int num = scanner.nextInt();
			if (num % 2 == 0){
				qtd++;
			}
		}
		System.out.println(qtd + " valores pares");
	}
}
