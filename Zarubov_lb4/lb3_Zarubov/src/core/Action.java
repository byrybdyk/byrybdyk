package core;
import util.Object;

public class Action extends Object {

    public Action(){
        super("БУМ");
        joinstory(getName());
    }

    public void  Boom(){
        System.out.print("Произошёл "+ getName() + "!!! ");
    }
}
