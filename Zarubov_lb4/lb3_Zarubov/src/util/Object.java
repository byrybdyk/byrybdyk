package util;
import java.util.Objects;
public abstract class Object implements getPlanet, getName{
    private String name;
    private PlanetEnum value;

    public Object(String name){
        this.name = name;
    }

    public Object(String name, PlanetEnum value){
        this.name = name;
        this.value = value;
    }

    protected void joinstory(String name){
        System.out.println(name + " в истории");
    }

    public String getName(){
        return this.name;
    }

    public PlanetEnum getPlanet(){
        return this.value;
    }

    public String toString(){
        return getName();
    }

    public int HashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(java.lang.Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Object object = (Object) o;
        return Objects.equals(name, object.name) && value == object.value;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, value);
    }

}
