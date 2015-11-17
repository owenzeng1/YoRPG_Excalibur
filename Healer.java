// Team Excalibur - Andrew Lin, James Wang, Owen Zeng
// APCS1 pd9
// HW#30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13

public class Healer extends Character {

    //Default Constructor
    public Healer (String name) {
	this.name = name;
	HP = 60;
	magic = 15;
	str = 5;
	def = 10;
	atkRate = 1; }
	
	public String about(){
	    return "Job description: A little girl with a PhD in application of bandages. She carries a first-aid kit and isn't afraid to use it.";
	}

    //Prepare for special attack where the damage will be the same but the next heal will heal less
    public void specialize () {
    System.out.println("Prayer");
    HP += (int)(Math.random() * magic);
    if (HP > 60){
        HP = 60;
    }
    def += 5;
    magic -= 5;
    }

    //Returns stats to a hidden "buffed" value (just trying to have some fun here)
    public void normalize() {
    magic = 20;
    def = 15;
    }

}
