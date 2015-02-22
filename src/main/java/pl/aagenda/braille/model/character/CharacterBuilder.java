package pl.aagenda.braille.model.character;

/**
 * Builder for six-dotted character.
 * @author mryohan
 */
public class CharacterBuilder {
    private Character instance;

    public CharacterBuilder() {
        instance = new Character();
    }
    
    public CharacterBuilder addDot(Dots dot) {
        if (!instance.dots.contains(dot)) {
            instance.dots.add(dot);
        }
        return this;
    }
    
    public CharacterBuilder removeDot(Dots dot) {
        if (instance.dots.contains(dot)) {
            instance.dots.remove(dot);
        }
        return this;
    }
    
    public CharacterBuilder clear() {
        instance.dots.clear();
        return this;
    }
    
    public Character build() {
        return (Character) instance.clone();
    }
}
