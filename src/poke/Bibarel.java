package poke;
import  ru.ifmo.se.pokemon.*;
import move.*;

public class Bibarel extends Bidoof{
    public Bibarel(String name, int level) {
        super(name, level);
        setStats(79, 85,60,55,60,71);
        setType(Type.NORMAL,Type.WATER);
        setMove(new Thunder(), new Growl(), new Swords_Dance(), new Waterfall());
    }
}
