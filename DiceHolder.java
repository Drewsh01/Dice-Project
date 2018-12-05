import java.util.*;
	public class DiceHolder{

	private ArrayList <Die> container = new ArrayList();
	private int passfail = 0;
		int addDie(Die die){
			if (container.size() == 6)
				passfail = -1;
			if (container.size() != 6){
				passfail = 1;
				container.add(die);
			}
			return passfail;
	}

		void shake(){

	}

		String toString(){

	}
}