import java.util.Scanner;

/* Zack Chambers
 * The following work is done by Zack Chambers and no one else can take credit for it.
 * Amr Elchouemi
 * CST 105
 */

public class NFLPlayers {
	
	//Private properties
	private String playerName, collegeAttended, position;
	private int age, height, completions, passingAttempts, rushingAttempts, TDs;
	private int INTs, weight;
	private double playerRating, yardsPerPass, yardsPerRush, yardsPerCatch, completionPercentage, totalYards;
	
	
	public int getRushingAttempts() {
		return rushingAttempts;
	}
	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}
	public double getTotalYards() {
		return totalYards;
	}
	public void setTotalYards(double totalYards) {
		this.totalYards = totalYards;
	}
	
	public String toString() {
		return playerName;
	}
	public String getName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCollegeAttended() {
		return collegeAttended;
	}

	public void setCollegeAttended(String collegeAttended) {
		this.collegeAttended = collegeAttended;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getYardsPerRush() {
		return totalYards / completions;
	}

	public void setYardsPerRush(double yardsPerRush) {
		this.yardsPerRush = yardsPerRush;
	}

	public double getYardsPerCatch() {
		return totalYards / completions;
	}

	public void setYardsPerCatch(double yardsPerCatch) {
		this.yardsPerCatch = yardsPerCatch;
	}

	public int getCompletions() {
		return completions;
	}

	public void setCompletions(int completions) {
		this.completions = completions;
	}

	public int getPassingAttempts() {
		return passingAttempts;
	}

	public void setPassingAttempts(int passingAttempts) {
		this.passingAttempts = passingAttempts;
	}

	public int getTDs() {
		return TDs;
	}

	public void setTDs(int tDs) {
		TDs = tDs;
	}

	public int getINTs() {
		return INTs;
	}

	public void setINTs(int iNTs) {
		INTs = iNTs;
	}

	public double getYardsPerPass() {
		return yardsPerPass;
	}

	public void setYardsPerPass(double yardsPerPass) {
		this.yardsPerPass = yardsPerPass;
	}

	public double getCompletionPercentage() {
		return (completions/passingAttempts);
	}

	public void setCompletionPercentage(double completionPercentage) {
		this.completionPercentage = completionPercentage;
	}

	public double getPlayerRating() {
		return playerRating;
	}

	public void setPlayerRating(double playerRating) {
		this.playerRating = playerRating;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

		
	//CONSTRUCTOR with no args
	public NFLPlayers() {
	 
	}
	//Parameters of CONSTRUCTOR with all properties as args
	public NFLPlayers(String playerName, String collegeAttended, String position, int age, int height,
					  double yardsPerRush, double yardsPerCatch, int completions, int passingAttempts, int TDs, int INTs, 
					  double yardsPerPass, double completionPercentage, int weight, double playerRating, double totalYards, double rushingAttempts) {
				
			}
	
	//Main method / driver method
	public static void main(String args[]) {
		
		//Test of no-argument constructor and toString method
		NFLPlayers brady1 = new NFLPlayers(); 
		brady1.setPlayerName("Tom Brady");
		
		//Test toString method, printing Quarterback name
		System.out.println("This will test the toString() method. Player name is: " + brady1.toString()); 
		
		//testing constructor with arguments
		NFLPlayers brady = new NFLPlayers("Tom Brady", "University of Michigan", "QB", 41, 6-5, 0.0, 0.0, 360, 575, 28, 10, 7.9, 66.3, 228, 96.0, 4577.0, 0);
		
		//Test of setters by invoking values of 'brady' object
		brady.setPlayerName("Tom Brady"); brady.setCollegeAttended("North Carolina State");
		brady.setAge(41); brady.setCompletions(385); brady.setPassingAttempts(581); brady.setCompletionPercentage(66.3);
		brady.setTDs(32); brady.setINTs(8); brady.setPlayerRating(98.0);
		
		//test a number of different attributes 
		System.out.println("Professional football player " + brady.getName() + " is age " + brady.age + "."); //Display player name
		System.out.println("Reflecting on the 2017 season, " + brady.playerName + " had " + brady.completions + " out of " 
							+ brady.passingAttempts + " and a completion percentage of " + brady.completionPercentage + "%.");
		System.out.println(brady.getName() + " threw " + brady.getTDs() + " touhcdowns and only " + brady.getINTs() + " interceptions.");
		System.out.println("This could be his final season, but with a " + brady.completionPercentage + "% completion percentage, a rating of "
				+ brady.playerRating + " and " + brady.passingAttempts + " passing attempts, he's sure to be back stronger than ever for the 2018 season.");
	}
}

