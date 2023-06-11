public class Magician extends Character {
    public Magician (int HP, int attack, int defense) {
        super(100, 60, 10);
    }
    
    @Override
    public boolean attack() {
        double probability = Math.random() * 100;

        if (probability >= 1 && probability <= 35) {
            return true;
        }
        else {
            return false;
        }
    }
}
