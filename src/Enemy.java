public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;

    public Enemy(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    public void setName(String Name) {
        this.name = Name;

    }
    public String getName() {
        return name;
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

 class Zombie extends Enemy{
    public Zombie(){
        super("Zombie",20,15);
    }
}

 class Dog extends Enemy{
    public Dog(){
        super("Dog", 28,10);
    }
}

  class GiantSpider extends Enemy{
    public GiantSpider (){
        super("Giant Spider", 10,3);
    }
  }

  class Cougar extends Enemy{
    public Cougar(){
        super("Giant Cougar",12,5);
    }
  }
