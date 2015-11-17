// Team Excalibur - Andrew Lin, James Wang, Owen Zeng
// APCS1 pd9
// HW#31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class God extends Character {

    //Default Constructor
    public God (String name) {
        this.name = name;
        HP = 100;
        magic = 40;
        str = 40;
        def = 30;
        atkRate = 1; }

    public String about(){
        return "Job description: No job description. You are GOD. Matter of fact, just tell me what MY job is.";
    }

    //Pepare for special attack
    public void specialize () {
        System.out.println("BURNOUT!");
        def = 15 ;
        atkRate = 1.25; }

    //Returns stats to original value (A God must have the best of every stat)
    public void normalize() {
        def = 30;
        atkRate = 1; }

}
