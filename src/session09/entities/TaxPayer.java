package session09.entities;

public class TaxPayer {

    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    // Default constructor
    public TaxPayer() {
    }

    // Parameterized constructor
    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    // Getter and setter methods for salaryIncome
    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    // Getter and setter methods for servicesIncome
    public double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    // Getter and setter methods for capitalIncome
    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    // Getter and setter methods for healthSpending
    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    // Getter and setter methods for educationSpending
    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    // Method to calculate tax on salary income
    public double salaryTax() {
        double salarioMensal = getSalaryIncome() / 12;
        return (salarioMensal < 3000.0 ? 0.0 : (salarioMensal < 5000.0 ? salarioMensal * 0.10 : salarioMensal * 0.20)) * 12;
    }

    // Method to calculate tax on services income
    public double servicesTax() {
        return getServicesIncome() * 0.15;
    }

    // Method to calculate tax on capital income
    public double capitalTax() {
        return getCapitalIncome() * 0.20;
    }

    // Method to calculate gross tax (sum of all taxes)
    public double grossTax() {
        return (salaryTax() + servicesTax() + capitalTax());
    }

    // Method to calculate tax rebate based on health and education spending
    public double taxRebate() {
        double taxLimit = (salaryTax() + servicesTax() + capitalTax()) * 0.30;
        double rebateSpending = getEducationSpending() + getHealthSpending();
        return Math.min(rebateSpending, taxLimit);
    }

    // Method to calculate net tax (gross tax minus tax rebate)
    public double netTax() {
        return (grossTax() - taxRebate());
    }

    public String toString(){
        return "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n" +
               "Abatimento: " + String.format("%.2f", taxRebate()) + "\n" +
               "Imposto devido: " + String.format("%.2f", netTax());
    }
}