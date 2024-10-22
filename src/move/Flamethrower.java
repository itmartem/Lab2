package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/flamethrower
public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.NORMAL,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().chance(0.1).condition(Status.BURN));
    }
    @Override
    protected String describe(){
        return "использует Flamethrower";
    }
}
