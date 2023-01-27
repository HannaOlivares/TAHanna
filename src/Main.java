
public class Main {
    public static void main(String[] args) {
        Item.Gold goldBar = new Item.Gold(100);
        Item.Weapon weapon = new Item.Weapon("super weapon", "Can do a lot damage", 5, 40);
        weapon.setDamage(40);
        int dvalue = weapon.getDamage();
        System.out.println(dvalue);
        goldBar.setName("goldBar");
        System.out.println(goldBar.getName());
        //magicSword
        Item.Weapon.Sword magicSword = new Item.Weapon.Sword();
        magicSword.setName("magicSword");
        System.out.println(magicSword.getName());
        //start of pillow
        Item.Weapon.Pillow softPillow = new Item.Weapon.Pillow();
        softPillow.setName("softPillow");
        System.out.println(softPillow.getName());
        //start of Mace
        Item.Weapon.Mace bigMace = new Item.Weapon.Mace();
        bigMace.setName("bigMace");
        System.out.println(bigMace.getName());
        Item.Weapon.Arrow bigArrow = new Item.Weapon.Arrow();
        bigArrow.setName("bigArrow");
        System.out.println(bigArrow.getName());

//call the constructors by stepping into it
 //use the debug
    }

}

