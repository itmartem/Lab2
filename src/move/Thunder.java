package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/thunder
public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 120, 70);
    }
    @Override
    public void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        p.addEffect(e);
    }
    @Override
    public String describe(){
        return "использует Thunder";
    }
}
