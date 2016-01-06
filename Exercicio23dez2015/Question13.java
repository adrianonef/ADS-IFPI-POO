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
public class Question13 {
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Entrada: dois numeros inteiros separados por espaço
		String coor = sc.nextLine();
		String listCoor[] = coor.split(" ");
		int x = Integer.parseInt(listCoor[0]);
		int y = Integer.parseInt(listCoor[1]);
		while(x != 0 && y !=0){
			String quad = x > 0 && y > 0 ? "primeiro" : x < 0 && y > 0 ? "segundo" : x < 0 && y < 0 ? "terceiro" : "quarto";
			System.out.println(quad);
			coor = sc.nextLine();
			listCoor = coor.split(" ");
			x = Integer.parseInt(listCoor[0]);
			y = Integer.parseInt(listCoor[1]);
		}
	}
}
