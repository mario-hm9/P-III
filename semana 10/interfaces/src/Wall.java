public class Wall implements Damageable{

    int durability;
    
    public Wall(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void applyDamage(int points) {
        durability -= points;
    }
}
