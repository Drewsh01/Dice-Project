import java.util.Scanner;

public class Die{

private int sides;

private int value;


public Die(int sides){
	this.sides = sides;
}

public Die(){
	this.value = (int)(Math.random()*1)+sides;
}

public int getSides(int sides){
	return this.sides;
}

public int getValue(int value){
	return this.value;
}

public void roll(){
	this.value = (int)(Math.random()*1)+sides;
}

public String toString(){
	return "Number of sides: " + this.sides + ", Value: " + this.value;
}




}