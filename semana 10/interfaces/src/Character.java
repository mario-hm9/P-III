public class Character implements Damageable {

    int health;

    public Character (int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void applyDamage(int points) {
        health -= points;
    }
}
