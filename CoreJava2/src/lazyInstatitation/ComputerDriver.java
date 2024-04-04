package lazyInstatitation;

public class ComputerDriver {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer("HP","Intel 5th Gen",500, 16, 75000);
		computer1.insertPendrive("Sandisk", 16, 800);
		computer1.showComputer();
		computer1.pendrive.showPendrive();
		
		Computer computer2 = new Computer("HP","Intel 7th Gen",1000, 32, 98000);
		computer2.insertPendrive("HP", 16, 2000);
		computer1.showComputer();
		computer2.pendrive.showPendrive();
	}
}
