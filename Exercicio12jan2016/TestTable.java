/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio12jan2016;

/**
 *
 * @author adrianonef
 */
public class TestTable {
    public static void main(String[] args) {
        Restaurant restaurante = new Restaurant("Chicos BAR",10);
        System.out.println(restaurante);
        restaurante.getTables()[1].setStatus("TESTE");
        System.out.println(restaurante);
    }
}
