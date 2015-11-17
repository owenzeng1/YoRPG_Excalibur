// Team Excalibur - Andrew Lin, James Wang, Owen Zeng
// APCS1 pd9
// HW#31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Monster extends Character {

    //default Constructor
    public Monster () {
        HP = 60;
        magic = 10;
        str = (int)(Math.random()*15 + 30);
        def = 10;
        atkRate = 1; }

    public String about (){
        return "Job description: You are probably a monster.";
    }

    public void normalize(){
        str = (int)(Math.random()*15 + 30);
    }

    public void specialize(){
        def = 10;
    }

}
