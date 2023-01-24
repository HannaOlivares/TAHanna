public class Item {
    protected String name;
    protected String desc;
    protected int value;

    //protected int damage;

    //constructor method
    public Item(String name, String desc, int value) {
        this.name = name;
        this.desc = desc;
        this.value = value;
    }

    static class Gold extends Item {


        public Gold(int amt) {
            super("Gold", String.format("Big Gold Bar! %d", amt), amt);
            this.value = amt;

        }
    }

    static class Weapon extends Item {
        private int damage;

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public Weapon(String name, String desc, int value, int damage) {
            super(name, desc, value);
            this.damage = damage;

        }

        static class Mace extends Weapon {
            public Mace() {
                super("Mace", "A mace is slightly more dangerous than a Sword", 10, 30);
            }
        }
        static class Sword extends Weapon {
            public Sword(){
                super("Sword", "A sword is made out of silver and causes a lot of damage", 15, 30);
            }
        }//this is the end of Sword class
        static class Pillow extends Weapon {

            public Pillow() {
                super("Pillow","A pillow is extremely soft", 1,1 );
            }

        }//This ends the Pillow class
        static class Arrow extends Weapon {
            public Arrow(){
                super("Arrow", "The Arrow is less dangerous than a Sword", 9, 20);
            }
        }//this is end of Arrow class
    }
}