public class Player {
    String name;
    boolean life = true; //only holds true or false
    //byte byte1 = 111;
   //int hp = 65535; //whole numbers, 32 bits is the max
   // long hp2 = 2147483648l; //64 bits
    short hp ; //16 bits
    short damage;

    public Player(String name, short hp ,short damage, boolean life){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.life = life;
    }

    public Player(String name, short hp ,short damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
     public boolean getLife(){
        if (hp <= 0)
            life = false;
        else
            life = true;
        return life;
     }
}
