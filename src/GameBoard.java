public class GameBoard {
   public String name;
   public Gametype gameType;
    public GameBoard(String name){
        this.name = name;
        this.gameType = Gametype.ThreeD;
    }
}
//enum to describe the code