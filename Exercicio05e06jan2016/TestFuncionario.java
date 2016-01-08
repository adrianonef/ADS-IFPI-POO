/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio05e06jan2016;

/**
 *
 * @author adrianonef
 */
public class TestFuncionario {
    public static void main(String[] args) {
     Funcionario f1 = new Funcionario();
   
     f1.setName("Adriano");
     f1.setSalary(15000);
     System.out.println("salario atual:" + f1.getSalary());
     f1.recebeAumento(50);
     f1.mostra();
   }
}
