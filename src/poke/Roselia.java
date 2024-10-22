//Roselia.java
package poke;
import  ru.ifmo.se.pokemon.*;
import move.*;

public class Roselia extends Budew{
    public Roselia(String name, int level) {
        super(name, level);
        setStats(50, 60,45,100,80,65);
        setType(Type.GRASS,Type.POISON);
        setMove(new Shadow_Ball(),new Inferno(), new Facade());
    }
}
