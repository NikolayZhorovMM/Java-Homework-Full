package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Players(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = List.of(this.name, Integer.toString(this.hitPoints), Integer.toString(this.strength), this.weapon);

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
        return "Player{name="+this.name+", hitPoints="+this.hitPoints+", strength="+this.strength+", weapon="+this.weapon+"}";
    }
}
