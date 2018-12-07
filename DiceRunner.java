import java.util.*;

public class DiceRunner{

	public static void main (String [] args){

	//Test 1

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
		if(first.getValue() == 1 && second.getValue() == 1){
			win = 1;
			System.out.print("Snake eyes was achieved after " + x + " attempts\n");
		}


		}




	//Test 2
	int j = 0;
	DiceHolder one = new DiceHolder();
	int w = 0;

	while(w < 6){
		j = (int)(Math.random()*18)+6;
		one.addDie(new Die(j));
		w ++;
	}

	System.out.println(one.toString());
	one.shake();
	System.out.println(one.toString());


















}
}


