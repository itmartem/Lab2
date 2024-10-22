package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/energy-ball
public class Energy_Ball extends SpecialMove {
    public Energy_Ball(){
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует Energy Ball";
    }
}
