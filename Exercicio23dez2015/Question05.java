/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Question05 {
    
    public static void main(String[] args) {
        int i,password;
        Interatividade interatividade = new Interatividade();
        
        for(i =0; i<3;i++){
            interatividade.digiteValor();
            password = interatividade.teclado.nextInt();
            if(password == 2002){
                System.out.println("Acesso Garantido");
                break;
            }
            else System.out.println("Senha Invalida");
        }
        if(i>=3) System.out.println("Acesso Negado");
        
    }
}
