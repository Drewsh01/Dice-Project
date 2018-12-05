import java.util.*;
	public class DiceHolder{

	private ArrayList <Die> container = new ArrayList();
	private int passfail = 0;
		public int addDie(Die die){
			if (container.size() == 6)
				passfail = -1;
			if (container.size() != 6){
				passfail = 1;
				container.add(die);
			}
			return passfail;
	}

		public void shake(Arraylist<>){
		for(int i = container.size(); i>= 0; i--)
			container.get(i).roll();
		return container;

	}

		public String toStringa(){

	}
}