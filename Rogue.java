// Team Excalibur - Andrew Lin, James Wang, Owen Zeng
// APCS1 pd9
// HW#30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13

public class Rogue extends Character {

    //Default Constructor
    public Rogue (String name) {
	this.name = name;
	HP = 85;
	magic = 15;
	str = 25;
	def = 20;
	atkRate = 1; }

    public String about(){
            return "Job description: A highly attractive woman with no sense of justice. TL;DR she will threaten you with a small dagger for your money.";
    }
    //Prepare for special attack
    public void specialize () {
    int critRoll = (int)(Math.random() * 100);
    atkRate = .75;
    System.out.println("Swift Shot");
    	if (critRoll < 50 ){
    	    System.out.println("CRITICAL HIT!!!");
    		atkRate = 2;
    	}
    }

    //Returns stats to original value
    public void normalize() {
	def = 20;
	atkRate = 1; }

}
