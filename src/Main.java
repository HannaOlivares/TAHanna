
public class Main {
    public static void main(String[] args) {
        Gold goldBar = new Gold(100);
        Weapon superweapon = new Weapon("super weapon", "Can do a lot damage", 5, 40);
        superweapon.setDamage(40);
        int dvalue = superweapon.getDamage();
        System.out.println(dvalue);
        goldBar.setName("goldBar");
        System.out.println(goldBar.getName());

        GameBoard gameboard = new GameBoard("tick tac toe");
        System.out.println(gameboard.name);

        //magicSword
        Item magicSword = new Sword();
        magicSword.setName("magicSword");
        System.out.println(magicSword.getName());

        //system.out.println(supperSword.name + " " + superSword.description);

        //start of pillow
        Weapon softPillow = new Pillow();
        softPillow.setName("softPillow");
        System.out.println(softPillow.getName());
        //start of Mace
        Weapon bigMace = new Mace();
        bigMace.setName("bigMace");
        System.out.println(bigMace.getName());

        Weapon bigArrow = new Arrow();
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
        Ogre redOgre = new Ogre();
        redOgre.setName("redOgre");
        System.out.println(redOgre.getName());

        Ogre greeeOgre = new Ogre();
        redOgre.setName("greenOgre");
        System.out.println(redOgre.getName());

        Zombie slowZombie = new Zombie();
        slowZombie.setName("slowZombie");
        System.out.println(slowZombie.getName());

        Zombie fastZombie = new Zombie();
        fastZombie.setName("fastZombie");
        System.out.println(fastZombie.getName());

        Dog spotDog = new Dog();
        spotDog.setName("spotDog");
        System.out.println(spotDog.getName());

        Cougar GiantCougar = new Cougar();
        GiantCougar.setName("GiantCougar");
        System.out.println(GiantCougar.getName());
    }

}

       /* Wizzard wizzard = new Wizzard(Spells.Fireballs);
       // Action action = new Action(Method.Flee);
    }

} */