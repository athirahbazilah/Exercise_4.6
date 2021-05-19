package Exercise4_6;

public class GreenApple extends Apple {
	
	private char seed;
	private int protein;
	
	public GreenApple() {
		
		super();
		seed = '-';
		protein = 0;
	}
	
	public GreenApple(String N, int Q, double P, char S, int Pr) {
		
		super(N, Q, P);
		this.seed = S;
		this.protein = Pr;
		
	}
	
	public char seed() {
		return this.seed;
	}
	
	public int protein() {
		return this.protein;
	}
	
	public double calPrice() {
		return super.price * super.quantity;
	}
	
	public String printDetail() {
		return ("Green Apple can help in digestion");
	}
	
	public String toString() {
		return super.toString() + ("\nGreen Apple Constructor is Invoked" + "\nQuantity Seed: " + seed + "\nProtein: " + protein + " g" + "\n" + printDetail());
	}

}
