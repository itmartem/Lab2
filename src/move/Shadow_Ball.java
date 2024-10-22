package move;
import  ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/shadow-ball
public class Shadow_Ball extends SpecialMove{
    public Shadow_Ball(){
        super(Type.GHOST, 80, 100);
    }
    public void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }
    public String describe(){
        return "использует Shadow Ball";
    }
}
