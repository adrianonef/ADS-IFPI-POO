/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio12jan2016;

/**
 *
 * @author adrianonef
 */
public class Table {
    private final static String DISPONIVEL ="Disponivel", OCUPADA = "Ocupada", RESERVADA = "Reservada";
    private final static int MAXITENS = 4;
    private static int counter = 0;
    private Order[] request;
    private String status;
    
    private int indentifier, counterItens, amountMaxItens = MAXITENS;
   

    
    public Order[] getRequest() {
        return request;
    }

    public void setRequest(Order[] request) {
        if(counterItens == amountMaxItens){
            //request = new Order[10];
            //for (int i = 0; i < request.length; i++) {
		//	request[i] = new Order();
		//}
        }else 
        
        this.request = request;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
           
            this.status = status;
           if(status.equals(DISPONIVEL)){
               //add array Order
           }
        
        
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter() {
        ++Table.counter;
    }

    public int getIndentifier() {
        return indentifier;
    }

    public void setIndentifier(int indentifier) {
        this.indentifier = indentifier;
    }

    public Table() {
        Table.setCounter();
        indentifier = Table.getCounter();
        status = DISPONIVEL;
    }

    @Override
    public String toString() {
        
        return "Mesa: "+ indentifier + "\nSituação: " + getStatus() ;
        //return "Table{" + "request=" + request + ", status=" + status + ", indentifier=" + indentifier + '}';
    }
    
    
}
