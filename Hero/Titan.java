public class Titan extends Character {

    public Titan (int HP, int attack, int defense) {
        super(200, 45, 0);
    }
    
    @Override
    public boolean attack() {
            double probability = Math.random() * 100;
    
            if (probability >= 1 && probability <= 40) {
                return true;
            }
            else {
                return false;
        }
    }
}
