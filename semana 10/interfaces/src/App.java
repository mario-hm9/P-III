import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Damageable> damageables = new ArrayList<Damageable>();


        Wall wall = new Wall(500);
        Character character = new Character(300);
        Knight knight = new Knight(400);

        damageables.add(wall);
        damageables.add(character);
        damageables.add(knight);

        for(Damageable d : damageables) {
            d.applyDamage(100);
        }

        System.out.println("Wall durability: " + wall.getDurability());
        System.out.println("Character health: " + character.getHealth());
        System.out.println("Knight health: " + knight.getHealth());
    }
}
