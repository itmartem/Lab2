import poke.*;
import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Main {
    public static void main (String[] args) {
        Battle bat = new Battle();
        Pokemon[] allPokemons = {
                new Palkia("1", 1),
                new Bidoof("2", 1),
                new Bibarel("3", 1),
                new Budew("4", 1),
                new Roselia("5", 1),
                new Roserade("6", 1)
        };
        Pokemon[] allies = new Pokemon[3];
        Pokemon[] foes = new Pokemon[3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            int index = rand.nextInt(allPokemons.length);
            if (allPokemons[index] != null) {
                allies[i] = allPokemons[index];
                allPokemons[index] = null;
            } else {
                i--;
            }
        }

        for (int i = 0; i < 3; i++) {
            int index = rand.nextInt(allPokemons.length);
            if (allPokemons[index] != null) {
                foes[i] = allPokemons[index];
                allPokemons[index] = null;
            } else {
                i--;
            }
        }
        for (Pokemon ally : allies) {
            if (ally != null) {
                bat.addAlly(ally);
            }
        }
        for (Pokemon foe : foes) {
            if (foe != null) {
                bat.addFoe(foe);
            }
        }
        bat.go();
    }
}
