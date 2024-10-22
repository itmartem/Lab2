package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/waterfall
public class Waterfall extends PhysicalMove {
    public Waterfall(){
        super(Type.WATER, 80, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return " использует Waterfall";
    }
}
