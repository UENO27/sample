import java.util.Random;

class Task1{
    public static void main(String[] args){
	int t = 0;
	int f = 0;
        Random r = new Random();   
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
    }
}
