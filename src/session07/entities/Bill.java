package session07.entities;

public class Bill {

    public static final double MEN_TICKET = 10.0;
    public static final double WOMAN_TICKET = 8.0;
    public static final double BEER_PRICE = 5.0;
    public static final double BARBECUE_PRICE = 7.0;
    public static final double SOFT_DRINK_PRICE = 3.0;
    public static final double COVER_PRICE = 4.0;

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover() {
        return (feeding() > 30.0) ? 0.0 : COVER_PRICE;
    }

    public double feeding() {
        return this.beer * BEER_PRICE + this.barbecue * BARBECUE_PRICE + this.softDrink * SOFT_DRINK_PRICE;
    }

    public double ticket() {
        return (this.gender == 'M') ? MEN_TICKET : WOMAN_TICKET;
    }

    public double total() {
        return feeding() + cover() + ticket();
    }

    public String toString() {
        return "\nRELATORIO\n" +
                "Consumo: R$ " + String.format("%.2f", feeding()) + "\n" +
                ((cover() == 0) ? "Isento de Couvert" : "Couvert: R$ " + String.format("%.2f", cover())) + "\n" +
                "Ingresso: R$ " + String.format("%.2f", ticket()) + "\n\n" +
                "Valor a Pagar: R$ " + String.format("%.2f", total()) + "\n";
    }
}
