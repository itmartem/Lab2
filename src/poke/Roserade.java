//Roserade.java
package poke;
import ru.ifmo.se.pokemon.*;
import move.*;

public class Roserade extends Roselia {
    public Roserade(String name, int level) {
        super(name, level);
        setStats(60, 70,65,125,105,90);
        setType(Type.GRASS,Type.POISON);
        setMove(new Shadow_Ball(),new Dazzling_Gleam(), new Growth(), new Energy_Ball());
    }
}
