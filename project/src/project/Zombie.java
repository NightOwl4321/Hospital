package project;

public class Zombie extends Patient{
	String deathDate = "";
 public Zombie(String deathDate) {
	 this.deathDate = deathDate;
 }
public String getTimeOfDeath() {
	// TODO Auto-generated method stub
	return deathDate;
}
}
