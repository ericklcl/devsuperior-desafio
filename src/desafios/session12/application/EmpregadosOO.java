package desafios.session12.application;

import desafios.session12.entities.Address;
import desafios.session12.entities.Department;
import desafios.session12.entities.Employee;

import java.util.Scanner;

public class EmpregadosOO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departmentName = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine();

        System.out.print("Email do departamento: ");
        String departmentEmail = sc.nextLine();

        System.out.print("Telefone do departamento: ");
        String departmentPhone = sc.nextLine();

        Department department = new Department(departmentName, payDay, new Address(departmentEmail, departmentPhone));

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            double employeeSalary = sc.nextDouble();
            sc.nextLine();
            department.addEmployee(new Employee(employeeName, employeeSalary));
        }

        System.out.println();
        showReport(department);

        sc.close();

    }

    public static void showReport(Department department) {
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.printf("Departamento %s = R$ %.2f%n", department.getName(), department.payroll());
        System.out.println("Pagamento realizado no dia " + department.getPayDay());
        System.out.println("Funcionarios:");
        for (Employee employee : department.getEmployees()) {
            System.out.println(employee.getName());
        }
        System.out.println("Para duvidas, favor entrar em contato: " + department.getAddress().getEmail());
    }
}
