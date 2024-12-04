public class Knight extends Character{
    
    public Knight (int health) {
        super(health);
    }

    public void applyDamage(int points) {
        health -= 0.9*points;
    }
}
