package desafios.session12.entities;

public class Employee {

    private String name;  // Nome do funcionário
    private Double salary;  // Salário do funcionário

    // Construtor padrão
    public Employee() {
    }

    // Construtor com argumentos
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter para o nome do funcionário
    public String getName() {
        return name;
    }

    // Setter para o nome do funcionário
    public void setName(String name) {
        this.name = name;
    }

    // Getter para o salário do funcionário
    public Double getSalary() {
        return salary;
    }

    // Setter para o salário do funcionário
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Metodo para aumentar o salário do funcionário
    public void increaseSalary(Double percentage) {
        salary += salary * percentage / 100.0;
    }

}
