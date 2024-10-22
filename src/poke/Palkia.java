//Palkia.java
package poke;
import  ru.ifmo.se.pokemon.*;
import move.*;

public class Palkia extends Pokemon{
    public Palkia(String name, int level) {
        super(name, level);
        setStats(90, 120,100,150,120,100);
        setType(Type.WATER,Type.DRAGON);
        setMove(new Confide(),new Focus_Blast(), new Aerial_Ace(), new Thunderbolt());
    }
}
