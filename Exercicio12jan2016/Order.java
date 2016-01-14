/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio12jan2016;

/**
 *
 * @author adrianonef
 */
public class Order {
    private String descripition;
    private float value;

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Order(String descripition, float value) {
        this.descripition = descripition;
        this.value = value;
    }

    public Order() {
    }

    
    @Override
    public String toString() {
        return  descripition  + "\t\t" + value ;
    }
    
}
