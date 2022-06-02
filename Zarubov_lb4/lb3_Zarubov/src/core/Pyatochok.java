package core;
import util.Object;

public class Pyatochok extends Object {

    private boolean lay = false;
    private boolean male = true;

    public Pyatochok(){
        super("Пятачок");
        joinstory(getName());

    }

    public void onGround(){
        if (lay){
            System.out.print(getName() +" лежит на земле, не понимает что произошло. ");
        }
        else{
            System.out.print(getName() +" стоит на земле, не понимает что произошло. ");
        }

    }
    public void thinkAboutBoom(Object var){
        System.out.println("Сперва "+ getName() + " подумал, что весь мир взлетел на воздух, потом он подумал, что, может быть, только их любимый "+ var);
    }

    public void thinkAboutSelf(Object var1, Object var2, Object var3, Object var4, Object var5){
        System.out.println("; ещё потом подумал что, может быть, только он, "+  var1 + " взлетел и сейчас он один-одинешенек лежит где-нибудь на "+ var2
                +" "+ var2.getPlanet() + " и никогда-никогда не увидит больше ни " + var3.getName() + "a , ни " + var4.getName() + "a , ни " + var5.getName() + "...");
    }
    public void confuse(Object var){
        if (lay){
            System.out.print("И тут ему пришло в голову, что даже и на " + var.getName() + " "+ var.getPlanet() + " не обязательно стоять в ступоре. Он осторожно осмотрелся кругом.");
        }
        else {
            System.out.print("И тут ему пришло в голову, что даже и на " + var.getName() + " "+ var.getPlanet() + " не обязательно всё время лежать носом вниз. Он осторожно встал, осмотрелся кругом.");
        }
    }
    public void posicion() throws layException{
        if (lay == true){
            System.out.println(getName()+" стоит. Всё в порядке");
        }
        else {
            throw new layException(getName()+ " сейчас лежит.");
        }
    }

    public void gender()throws Throwable{
        if (male == true){
            System.out.println("*"+getName()+" мужчина. После взрыва пол не изменился.*");
        }
        else{
            throw new RuntimeException();
        }
    }
}
