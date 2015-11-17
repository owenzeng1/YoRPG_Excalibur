// Team Excalibur - Andrew Lin, James Wang, Owen Zeng
// APCS1 pd9
// HW#31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Mage extends Character {

    //Default Constructor
    public Mage (String name) {
        this.name = name;
        HP = 75;
        magic = 40;
        str = 5;
        def = 20;
        atkRate = 1; }

    public String about(){
        return "Job description: A flimsy old man waving his cane around, but that's the least of your worries because the cane shoots fireballs.";
    }

    //Pepare for special attack
    public void specialize () {
        System.out.println("FIREBALL!!!");
        System.out.println("5 health points hath been lost.");
        int critRoll = (int)(Math.random() * 100);
        atkRate = 1.25;
        HP -= 5;
        if (critRoll < 20) {
            System.out.println("CRITICAL HIT!");
            atkRate = 1.75;
        }
    }

    //Returns stats to original value
    public void normalize() {
        magic = 40;
        atkRate = 1; }

}
