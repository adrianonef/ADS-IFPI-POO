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
     Funcionario f2 = new Funcionario("Jose");
   
     f1.setName("Adriano");
     f1.setSalary(15000);
     f1.recebeAumento(50);
     f1.mostra();
     
     f2.setSalary(10000);
     f2.recebeAumento(50);
     f2.mostra();
   }
}
