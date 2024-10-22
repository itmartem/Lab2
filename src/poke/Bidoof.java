package poke;
import  ru.ifmo.se.pokemon.*;
import move.*;

public class Bidoof extends Pokemon{
    public Bidoof(String name, int level) {
        super(name, level);
        setStats(59, 45, 40, 35, 40, 31);
        setType(Type.NORMAL);
        setMove(new Thunder(),new Growl(), new Swords_Dance());
    }
}
