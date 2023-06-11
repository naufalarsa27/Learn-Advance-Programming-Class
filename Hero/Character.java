public abstract class Character {
    private int defense, attack, HP;

    public Character(int HP, int attack, int defense) {
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage) {
        this.HP -= (damage - getDefense());
    }

    public void info() {
        System.out.println("HP = " + getHP());
        System.out.println("ATK = " + getAttack());
        System.out.println("DEF = " + getDefense());
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }
 
}
