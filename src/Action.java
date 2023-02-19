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
    private Method method;
    public MoveNorth(){
        super(Method.MoveNorth, "Move North", 'n',null);
        this.method = method;
    }
}

class MoveEast extends Action{
    private Method method;
    public MoveEast(){
        super (Method.MoveEast,"Move East", 'e',null);
        this.method = method;
    }
}

class MoveSouth extends Action{
    private Method method;
    public MoveSouth(){
        super(Method.MoveSouth,"Move South",'s',null);
        this.method = method;
    }
}
class MoveWest extends Action{
    private Method method;
    public MoveWest(){
        super(Method.MoveWest,"Move West",'w',null);
    this.method = method;
    }

}
class ViewInventory extends Action{
    private Method method;
    public ViewInventory(){
        super(Method.ViewInventory,"View Inventory", 'i',null);
        this.method = method;
    }
}
class Flee extends Action{
    //constructor method
    private Method method;
    public Flee(Method method){
        super(Method.Flee,"Flee as fast as you can ",'f',null);
        this.method = method;
    }
}

class Fight extends Action{
    private Method method;
    public Fight(Method method){

        super(Method.stab,"Fighting can beat enemies",'F',null);
    this.method = method;
}
}


