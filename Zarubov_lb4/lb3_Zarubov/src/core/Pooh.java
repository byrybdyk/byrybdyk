package core;

import util.Object;

public class Pooh extends Object {
    private static boolean bear = true;

    public Pooh(){
        super("Пух");
        joinstory(getName());
    }

    public static class Bear{

        public static boolean isBear() {
            return bear;
        }
    }

}
