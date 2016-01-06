/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Question06 {
    
    public static void main(String[] args) {
        Interatividade interatividade = new Interatividade();
        int n,value, amontTypeC = 0, amontTypeR = 0, amontTypeS = 0;
        String type;
        
        interatividade.digiteValor();
        n = interatividade.teclado.nextInt();
        for(int i =0; i < n ; i++){
            interatividade.digiteValor();
            value = interatividade.teclado.nextInt();
            System.out.println("Digite o tipo C = Coelho, R = Rato, S = Sapo");
            type = interatividade.teclado.next();
            interatividade.teclado.nextLine();
            amontTypeC = type.toUpperCase().equals("C") ? amontTypeC + value : amontTypeC;
            amontTypeR = type.toUpperCase().equals("R") ? amontTypeR + value : amontTypeR;
            amontTypeS = type.toUpperCase().equals("S") ? amontTypeR + value : amontTypeR;
            }
        System.out.println("Total "+ (amontTypeC + amontTypeR + amontTypeS)+ " Cobaias");
        System.out.println("Total de coelhos: "+amontTypeC);
        System.out.println("Total de ratos: "+amontTypeR);
        System.out.println("Total de sapos: "+amontTypeS);
        System.out.println("Percentual de coelhos: "+(amontTypeC * 100 /(amontTypeC + amontTypeR + amontTypeS))+"%");
        System.out.println("Percentual de ratos: "+(amontTypeR * 100 /(amontTypeC + amontTypeR + amontTypeS))+"%");
        System.out.println("Percentual de sapos: "+(amontTypeS * 100 /(amontTypeC + amontTypeR + amontTypeS))+"%");
        }
}   
