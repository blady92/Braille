package pl.aagenda.braille.model.character;

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a six-dotted character.
 * @author mryohan
 */
public class Character {
    List<Dots> dots = new ArrayList<>();

    public List<Dots> getDots() {
        return dots;
    }

    public void setDots(List<Dots> dots) {
        this.dots = dots;
    }
    
    @Override
    public Object clone() {
        Character instance = new Character();
        instance.setDots(new ArrayList<>(dots));
        return instance;
    }

    @Override
    public String toString() {
        return "Character{" + "dots=" + dots + '}';
    }
}
