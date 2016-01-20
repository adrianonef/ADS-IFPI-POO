/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio19jan2016;

/**
 *
 * @author adrianonef
 */
public class ContaCorrente extends Conta{
    @Override
    public void atualiza(double taxa){
        super.atualiza(taxa*2);
    }
    
    @Override
    public void deposita(double valor){
        super.deposita(valor - 0.1);
    }
}
