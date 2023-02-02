public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;

    public Enemy(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public boolean is_alive() {
        return (this.hp > 0);
    }
}
    class Ogre extends Enemy{
        public Ogre(){
            super("Ogre", 20,30);

        }
    }


