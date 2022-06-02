package core;


import util.Object;
import util.PlanetEnum;

public class Planet extends Object {
   public Planet(){
       super("Планета", PlanetEnum.Луна);
       joinstory(getName());
   }

}
