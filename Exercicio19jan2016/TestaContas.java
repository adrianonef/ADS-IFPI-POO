/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio19jan2016;

/**
 *
 * @author adrianonef
 */
public class TestaContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        
        System.out.println(c.getSalto());
        System.out.println(cc.getSalto());
        System.out.println(cp.getSalto());
    }
}
