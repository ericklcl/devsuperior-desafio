package session08.entities;

public class Champion {

    // Atributos da classe Champion
    private String name;
    private int life;
    private int attack;
    private int armor;

    // Construtor padrão
    public Champion() {
    }

    // Construtor com parametros
    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    // Getter para o nome
    public String getName() {
        return name;
    }

    // Setter para o nome
    public void setName(String name) {
        this.name = name;
    }

    // Getter para a vida
    public int getLife() {
        return life;
    }

    // Getter para o ataque
    public int getAttack() {
        return attack;
    }

    // Getter para a armadura
    public int getArmor() {
        return armor;
    }

    // Metodo para calcular e aplicar o dano recebido de outro campeao
    public void takeDamage(Champion other) {
        int damage = other.getAttack() - this.getArmor(); // Calcula o dano
        if (damage > 0) { // Se o dano for positivo
            if (this.life - damage < 0) { // Garante que a vida não fique abaixo de zero
                this.life = 0;
            } else {
                this.life -= damage; // Aplica o dano
            }
        } else {
            this.life -= 1; // Dano mínimo é 1
        }
    }

    // Metodo para retornar o status do campeao
    public String status() {
        return getName() + ": " + getLife() + " de vida";
    }
}