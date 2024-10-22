package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/focus-blast
public class Focus_Blast extends SpecialMove {
    public Focus_Blast(){
        super(Type.FIGHTING, 120, 70);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует Focus Blast";
    }
}
