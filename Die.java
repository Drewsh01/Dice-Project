import java.util.*;

public class Die{

private int sides;

private int value;


public Die(int sides){
	this.sides = sides;
	this.value = (int)(Math.random()*sides)+1;
}

public Die(){
	this.sides = 6;
	this.value = (int)(Math.random()*6)+1;
}

public int getSides(int sides){
	return this.sides;
}

public int getValue(){

	return this.value;
}

public void roll(){
	this.value = (int)(Math.random()*sides)+1;

}

public String toString(){
	return ("Number of sides: " + this.sides + ", Value: " + this.value);
}




}