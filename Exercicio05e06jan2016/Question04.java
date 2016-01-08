/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */


/**
 *
 * @author adrianonef
 */
public class Question04 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();    
        f1.name = "Danilo";
        f1.salary = 100;

        Funcionario f2 = new Funcionario();    
        f2.name = "Danilo";
        f2.salary = 100;

        if (f1 == f2) {
          System.out.println("iguais");
        } else {
          System.out.println("diferentes");    
        }
    }
}
