public class Action {
    private Method method;
    private char hotkey;
    public char getHotkey(){
        return hotkey;
    }

    public void setHotkey(char hotkey){
    this.hotkey = hotkey;
    }
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private Enemy kwargs;
    public Enemy getKwargs() {
        return kwargs;
    }
    public void setKwargs(Enemy kwargs){
        this.kwargs = kwargs;
    }
    public Action(Method method, String name, char hotkey, Enemy Kwargs){
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;

    }
    public String str(){return hotkey +": "+ name;}
}


class MoveNorth extends Action{
    public MoveNorth(){
        super(Method.MoveNorth, "Move North", 'n',null);
    }
}

class MoveEast extends Action{
    public MoveEast(){
        super (Method.MoveEast,"Move East", 'e',null);
    }
}

class MoveSouth extends Action{
    public MoveSouth(){
        super(Method.MoveSouth,"Move South",'s',null);
    }
}
class MoveWest extends Action{
    public MoveWest(){
        super(Method.MoveWest,"Move West",'w',null);
    }
}
class ViewInventory extends Action{
    public ViewInventory(){
        super(Method.ViewInventory,"View Inventory", 'i',null);
    }
}
class Flee extends Action{
    //constructor method
    public Flee(){
        super(Method.Flee,"Flee",'f',null);
    }
}

class Fight extends Action{
    public Fight(){
        super(Method.Fight,"Fight",'F',null);
    }

}


