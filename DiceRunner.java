public class DiceRunner{
	public static void main (String [] args){

Die first = new Die(8);
Die second = new Die(8);

int x = 0;

while(first.getValue() != 1 && second.getValue() != 1){
	first.roll();
	second.roll();
	x ++;
	System.out.println("Die 1: " + first.getValue() + "  Die 2: " + second.getValue());

	if(first.getValue() == 1 && second.getValue() == 1){
		System.out.println("You got snake eyes, after " + x + " attempts");
	}

}


}
}