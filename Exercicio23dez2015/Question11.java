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
public class Question11 {
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//1.Alcool 2.Gasolina 3.Diesel 4.Fim
		int op = sc.nextInt();
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		while (op != 4){
			if (op == 1){
				qtdAlcool++;
			}else{
				if (op == 2){
					qtdGasolina++;
				}else{
					if (op == 3){
						qtdDiesel++;
					}
				}
			}
			op = sc.nextInt();
		}
		System.out.format("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", qtdAlcool, qtdGasolina, qtdDiesel);
		
	}
}
