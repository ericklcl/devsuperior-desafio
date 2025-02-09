package session09.application;

import session09.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DesafioContribuinteApp {

    public static void main(String[] args) {

        // Set the default locale to US to ensure correct number formatting
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        // Prompt the user to enter the number of taxpayers
        System.out.print("Quantos contribuintes voce vai digitar: ");
        int n = sc.nextInt();

        // Loop to gather data for each taxpayer
        for (int i = 0; i < n; i++) {
            System.out.println("\nDados do contribuinte #" + (i + 1) + ":");

            // Collect annual salary income
            System.out.print("Renda anual com salario: ");
            double rendaSalario = sc.nextDouble();

            // Collect annual service income
            System.out.print("Renda anual com prestacao de servico: ");
            double rendaPrestacaoServico = sc.nextDouble();

            // Collect annual capital gains income
            System.out.print("Renda anual com ganho de capital: ");
            double rendaGanhoCapital = sc.nextDouble();

            // Collect medical expenses
            System.out.print("Gastos medicos: ");
            double gastosMedicos = sc.nextDouble();

            // Collect educational expenses
            System.out.print("Gastos educacionais: ");
            double gastosEducacionais = sc.nextDouble();

            // Add the new TaxPayer object to the list
            list.add(new TaxPayer(rendaSalario, rendaPrestacaoServico, rendaGanhoCapital, gastosMedicos, gastosEducacionais));
        }

        // Loop to print the summary for each taxpayer
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\nResumo do " + (i + 1) + "º contribuinte:");
            System.out.println(list.get(i).toString());
        }

        // Close the Scanner object to free up resources
        sc.close();
    }
}