// Team Excalibur - Andrew Lin, James Wang, Owen Zeng
// APCS1 pd9
// HW#30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13

public class Warrior extends Character {

    //Default Constructor
    public Warrior (String name) {
	this.name = name;
	HP = 100;
	magic = 0;
	str = 40;
	def = 30;
	atkRate = 1; }
	
	public String about(){
		return "Job description: A physically-a-lot-bigger-than-you type of guy that carries a sword twice his size. His biceps are larger than your face.";
	}

    //Pepare for special attack
    public void specialize () {
    System.out.println("Blade Bash");
	def = 25 ;
	atkRate = 1.25; }

    //Returns stats to original value
    public void normalize() {
	def = 30;
	atkRate = 1; }

}
