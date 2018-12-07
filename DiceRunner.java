public class DiceRunner{

	public static void main (String [] args){

	Die first = new Die(8);
	Die second = new Die(8);
	int x = 0;
	int win = 0;

	while (win == 0){
		if(first.getValue() != 1 || second.getValue() != 1){
			first.roll();
			second.roll();
			x ++;
			System.out.println("Dice 1: " + first.getValue() + " Dice 2: " + second.getValue());
		}


while(first.getValue() != 1 && second.getValue() != 1){
	first.roll();
	second.roll();
	x ++;
	System.out.println("Die 1: " + first.getValue() + "  Die 2: " + second.getValue());

		if(first.getValue() == 1 && second.getValue() == 1){
			win = 1;
			System.out.print("Snake eyes was achieved after " + x + " attempts");
		}


	}




}
}