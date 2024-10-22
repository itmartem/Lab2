package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/inferno
public class Inferno extends SpecialMove {
    public Inferno() {
        super(Type.FIRE, 100, 50);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().condition(Status.BURN));
    }
    @Override
    protected String describe(){
        return "использует Inferno";
    }
}
