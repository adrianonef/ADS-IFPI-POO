/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio05e06jan2016;

/**
 *
 * @author adrianonef
 */
public class Funcionario {
    private String name, department, dateBank, rg;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateBank() {
        return dateBank;
    }

    public void setDateBank(String dateBank) {
        this.dateBank = dateBank;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    void recebeAumento(int value){
        salary = salary + value;
    }
    double calculaGanhoAnual(){
        return salary*12;
    }
    void mostra(){
        System.out.println("Nome: "+name);
        System.out.println("Departamento: "+department);
        System.out.println("Data abertura de conta : "+dateBank);
        System.out.println("salario atual:" + salary);
        System.out.println("ganho anual:" + calculaGanhoAnual());
    }

    public Funcionario() {
    }

    public Funcionario(String name) {
        this.name = name;
    }
    
}
