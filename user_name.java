import java.util.Random;
import java.util.Scanner;

class user_name{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int t = 0;
	int f = 0;
        Random r = new Random();
	
	System.out.println("Who are you?");
	String Name = sc.next();
	System.out.println("Hello, " + Name + "!");
	System.out.println("Tossing a coin...");
	for(int i = 1; i <= 3; i++){
	    boolean b = r.nextBoolean();
	    System.out.print("Round " + i +": ");
	    if(b){
		System.out.println("Hand");
		t++;
	    }
	    else {
		System.out.println("Tail");
		f++;
	    }
	}
	System.out.println("Heads: " + t +", Tails: "+ f);
	if(t > f)System.out.println(Name + " won!");
	if(t < f)System.out.println(Name + " lost.");    
    }
}
