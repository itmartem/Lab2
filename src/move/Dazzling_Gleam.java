package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/dazzling-gleam
public class Dazzling_Gleam extends SpecialMove {
    public Dazzling_Gleam(){
        super(Type.FAIRY, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует Dazzling Gleam";
    }
}
