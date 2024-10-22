package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/growth
public class Growth extends StatusMove {
    public Growth(){
        super(Type.GRASS, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует Growth";
    }
}
