package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = List.of(this.name, Integer.toString(this.hitPoints), Integer.toString(this.strength));

        return list;
    }

    @Override
    public void read(List<String> list) {
        /**
         * not quite an understandable description for read() method
         */
    }

    @Override
    public String toString() {
        return "Monster{name="+this.name+", hitPoints="+this.hitPoints+", strength="+this.strength+"}";
    }
}
