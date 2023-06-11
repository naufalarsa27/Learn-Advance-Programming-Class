public class Warrior extends Character {
    public Warrior (int HP, int attack, int defense) {
        super(80, 25, 30);
    }

    @Override
    public boolean attack() {
            double probability = Math.random() * 100;
    
            if (probability >= 1 && probability <= 60) {
                return true;
            }
            else {
                return false;
        }
    }
}
