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
public class Question14 {
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= 10; i++){
			System.out.println(i + " x " + num + " = " + (i*num));
		}
		
	}
}
