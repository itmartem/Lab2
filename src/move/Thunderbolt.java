package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/thunderbolt
public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 95,100);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).condition(Status.PARALYZE);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return " использует Thunderbolt";
    }
}
