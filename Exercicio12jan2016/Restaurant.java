/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio12jan2016;

/**
 *
 * @author adrianonef
 */
public class Restaurant {
    private Table[] tables;
    private String Name;

    public Table[] getTables() {
        return tables;
    }

    public void setTables(Table[] tables) {
        this.tables = tables;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Restaurant(String Name, int number) {
        this.tables = new Table[number];
        for (int i = 0; i < tables.length; i++) {
			tables[i] = new Table();
		}
        this.Name = Name;
    }
    
    
    @Override
    public String toString() {
        String str = "";
        for (Table mesa : tables) {
			str += "\nMesa: "+ mesa.getIndentifier()+ " Situação: "+ mesa.getStatus();
		}
        return Name + " com " +tables.length + " mesas.\n-----------------------"+str;
    }
    
}
