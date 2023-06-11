public class Healer extends Character {

    public Healer (int HP, int attack, int defense) {
        super(70, 10, 10);
    }
    
    public void heal() {
        setHP(getHP() + 25);
    }

    @Override
        public boolean attack() {
            double probability = Math.random() * 100;
    
            if (probability >= 1 && probability <= 85) {
                return true;
            }
            else {
                return false;
        }
    }
}
