package move;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/aerial-ace
public class Aerial_Ace extends PhysicalMove {
    public Aerial_Ace(){
        super(Type.FLYING,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует Swords Aerial Ace";
    }
}
