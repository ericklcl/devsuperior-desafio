package session07.application;

import session07.entities.Bill;
import java.util.Scanner;

// DESAFIO Bar OO Java
public class Desafio0701 {

    public static void main(String[] args) {

        Bill bill = new Bill();
        boolean valid_gender = false;
        boolean valid_beer = false;
        boolean valid_softDrink = false;
        boolean valid_barbecue = false;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Sexo: ");
            bill.gender = Character.toUpperCase(sc.next().charAt(0));
            if (bill.gender == 'M' || bill.gender == 'F') {
                valid_gender = true;
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
            }
        } while (!valid_gender);

        do {
            System.out.print("Quantidade de cervejas: ");
            bill.beer = sc.nextInt();
            if (bill.beer >= 0) {
                valid_beer = true;
            } else {
                System.out.println("Quantidade inválida. Digite um número maior ou igual a zero.");
            }
        } while (!valid_beer);

        do {
            System.out.print("Quantidade de refrigerantes: ");
            bill.softDrink = sc.nextInt();
            if (bill.softDrink >= 0) {
                valid_softDrink = true;
            } else {
                System.out.println("Quantidade inválida. Digite um número maior ou igual a zero.");
            }
        } while (!valid_softDrink);

        do {
            System.out.print("Quantidade de espetinhos: ");
            bill.barbecue = sc.nextInt();
            if (bill.barbecue >= 0) {
                valid_barbecue = true;
            } else {
                System.out.println("Quantidade inválida. Digite um número maior ou igual a zero.");
            }
        } while (!valid_barbecue);

        System.out.println(bill);

        sc.close();
    }
}
