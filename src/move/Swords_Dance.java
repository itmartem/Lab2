package move;

import ru.ifmo.se.pokemon.*;

public class Swords_Dance extends StatusMove {
    public Swords_Dance(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует Swords Dance";
    }
}
