/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio19jan2016;

/**
 *
 * @author adrianonef
 */
public class Conta {
    private double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor ){
        this.saldo -= valor;
    }
    public void atualiza(double taxa ){
        this.saldo += this.saldo * taxa;
    }
    public double getSalto(){
        return this.saldo;
    }
}
