// Team Excalibur - Andrew Lin, James Wang, Owen Zeng
// APCS1 pd9
// HW#31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public abstract class Character {

    // Instance variables
    public int HP;
    public int str;
    public int def;
    public int magic;
    public double atkRate;
    public String name;

    //Check is character is alive
    public boolean isAlive() {
        return (HP > 0); }

    public int getDefense () {
        return def; }

    public int getMagic() {
        return magic;
    }

    // Empty methods to be overridden
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about();

    public String getName() {
        return name;
    }

    public void lowerHP (int dmg) {
        HP -= dmg; }

    // Reduce the character's hp based on atkRate and the character's defense stat
    public int attack (Character s) {
        int dmg = (int) ((((str + magic)/2) * atkRate) - s.getDefense());
        if (dmg < 0){
            dmg = 0;
        }
        s.lowerHP (dmg);
        return dmg;}

}
