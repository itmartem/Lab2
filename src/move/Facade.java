package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/facade
public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        if (def.getCondition() == Status.BURN || def.getCondition() == Status.PARALYZE || def.getCondition() == Status.POISON) {
            super.applyOppDamage(def, damage);
        }
    }
    @Override
    protected String describe() {
        return "использует Facade";
    }
}
