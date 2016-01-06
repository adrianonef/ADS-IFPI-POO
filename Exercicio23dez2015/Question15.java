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
public class Question15 {
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String caract1 = sc.nextLine();
		String caract2 = sc.nextLine();
		String caract3 = sc.nextLine();
		String animal = "";
		
		if (caract1.equals("vertebrado")){
			if (caract2.equals("ave")){
				animal = caract3.equals("carnivoro") ? "aguia" : caract3.equals("onivoro") ? "pomba" : "";
			}else{
				if (caract2.equals("mamifero")){
					animal = caract3.equals("onivoro") ? "homem" : caract3.equals("herbivoro") ? "vaca" : "";
				}
			}
		}else{
			if (caract1.equals("invertebrado")){
				if (caract2.equals("inseto")){
					animal = caract3.equals("hermatofago") ? "pulga" : caract3.equals("herbivoro") ? "lagarta" : "";
				}else{
					if (caract2.equals("anelideo")){
						animal = caract3.equals("hermatofago") ? "sanguessuga" : caract3.equals("onivoro") ? "minhoca" : "";					
					}
				}
			}
		}
		System.out.println(animal);		
	}
}
