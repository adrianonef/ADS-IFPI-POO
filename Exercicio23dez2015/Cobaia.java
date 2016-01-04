/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Cobaia {
    private int amontTest;
    private String type;

    
    
    
    public Cobaia(){
        
    }
    
    public int getAmontTest() {
        return amontTest;
    }

    public void setAmontTest(int amontTest) {
        this.amontTest = amontTest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Cobaia(int amontTest, String type) {
        this.amontTest = amontTest;
        this.type = type;
    }
    
    
}
