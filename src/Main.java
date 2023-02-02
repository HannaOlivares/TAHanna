
public class Main {
    public static void main(String[] args) {
        Item.Gold goldBar = new Item.Gold(100);
        Item.Weapon weapon = new Item.Weapon("super weapon", "Can do a lot damage", 5, 40);
        weapon.setDamage(40);
        int dvalue = weapon.getDamage();
        System.out.println(dvalue);
        goldBar.setName("goldBar");
        System.out.println(goldBar.getName());

        GameBoard gameboard = new GameBoard("tick tac toe");
        System.out.println(gameboard.name);

        //magicSword
        Item.Weapon.Sword magicSword = new Item.Weapon.Sword();
        magicSword.setName("magicSword");
        System.out.println(magicSword.getName());

        //system.out.println(supperSword.name + " " + superSword.description);


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
     //   Player player1 = new Player("Hanna", (short)100,(short)10,true);
      //  if (player1.getLife())
      //  System.out.println("Player is alive");
       // else
     //   System.out.println("Player is not alive");

      //  Player player2 = new Player("SW", (short)0,(short)100,true);
       // if (player1.getLife())
       // System.out.println("Player is alive");
       // else
       // System.out.println("Player is not alive");
    }
}

