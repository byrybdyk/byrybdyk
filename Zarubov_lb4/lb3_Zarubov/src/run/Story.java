package run;

import core.*;


public class Story {
    public static void main(String[] args) throws Throwable {

        Action Boom = new Action();
        Pyatochok pyatochok = new Pyatochok();
        Forest forest = new Forest();
        Planet planet = new Planet();
        Pooh pooh = new Pooh();
        Robin robin = new Robin();
        IA ia = new IA();
        /* Pyatochok ia = new Pyatochok(){
            public void thinkAboutBoom(Object var){
                System.out.println("Сперва Иа подумал... Стоп. Причём тут Иа?");
            }
        };  анонимный класс */

        System.out.println("");
        Boom.Boom();
        pyatochok.onGround();
        pyatochok.gender();
        pyatochok.thinkAboutBoom(forest);
        //ia.thinkAboutBoom(forest);
        pyatochok.thinkAboutSelf(pyatochok,planet,pooh,robin,ia);
        try{
            pyatochok.posicion();
        }
        catch (layException e){
            System.out.println(e.getMessage());
        }
        pyatochok.confuse(planet);

        /*Pooh.Bear BEAR = new Pooh.Bear();
        System.out.println(BEAR.isBear());
        static class */

    }
}
