package Exercise4_6;

public class Apple extends Fruit{
	
	protected int quantity;
	protected double price;
	
	public Apple() { //constructor for sub class
		
		super(); //inherit from super class (constructor with no argument)
		quantity = 0;
		price = 0;
	}
	
	public Apple(String N, int Q, double P) { //constructor sub class with argument
		
		super(N); //called method in superclass with passing parameter
		quantity = Q;
		price = P;
		
		Price ApTP = new AppleTotalPrice();
		Price AvTP = new AvocadoTotalPrice();
		Price RATP = new RedAppleTotalPrice();
		Price GATP = new GreenAppleTotalPrice();
		
		if (this.quantity < 10) {
			System.out.println(N);
			System.out.println("Price per unit: RM " + P);
			System.out.println("Quantity: " + Q);
			System.out.println("Total Price: RM " + (price * quantity));
			
		}
		else if (this.quantity > 10 && this.quantity < 100) {
			if (N == "Apple") {
				double Pr = 1.00;
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Quantity: " + Q);
				System.out.println("Total Price: RM " + (quantity * Pr));
			}
			
			else if (N == "Red Apple") {
				double Pr = 1.80;
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Quantity: " + Q);
				System.out.println("Total Price: RM " + (quantity * Pr));
			}
			
			else if (N == "Green Apple") {
				double Pr = 3.70;
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Quantity: " + Q);
				System.out.println("Total Price: RM " + (quantity * Pr));
			}
			
			else if (N == "Avocado") {
				double Pr = 1.50;
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Quantity: " + Q);
				System.out.println("Total Price: RM " + (quantity * Pr));
			}
			
		}
		else {
			double Pr = 0.8;
			double Disc;
			
			if (N == "Apple") {
				Discount d = new RedAppleDiscount();
				Disc = d.discountRate(); //discount rate
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Discount Rate: " + d.discountRate() * 100 + " %");
				System.out.println("Total Price: RM " + ((quantity * Pr) - (quantity * Pr * Disc)));
			}
			
			else if (N == "Red Apple") {
				Discount d = new RedAppleDiscount();
				Disc = d.discountRate(); //discount rate
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Discount Rate: " + d.discountRate() * 100 + " %");
				System.out.println("Total Price: RM " + ((quantity * Pr) - (quantity * Pr * Disc)));
			}
			
			else if (N == "Green Apple") {
				Discount d = new GreenAppleDiscount();
				Disc = d.discountRate(); //discount rate
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Discount Rate: " + d.discountRate() * 100 + " %");
				System.out.println("Total Price: RM " + ((quantity * Pr) - (quantity * Pr * Disc)));
			}
			
			else {
				Discount d = new AvocadoDiscount();
				Disc = d.discountRate(); //discount rate
				System.out.println(N);
				System.out.println("Price per unit: RM " + Pr);
				System.out.println("Discount Rate: " + d.discountRate() * 100 + " %");
				System.out.println("Total Price: RM " + ((quantity * Pr) - (quantity * Pr * Disc)));
			}
		}
	}
	
	public double TotalPrice() { //overloading with no argument
		return this.quantity * this.price;
	}
	public double TotalPrice(double Pr) { //overloading with one argument
		return this.quantity * Pr;
	}
	
	public double TotalPrice(double Pr, double Disc) { //overloading with 2 argument
		return (this.quantity * Pr) - (this.quantity * Pr * Disc);
	}
	
	public String printDetail() { 
		return ("Apple can lower high cholesterol");
	}
	
	public String toString() {
		return super.toString() + "\n" + printDetail();
	}

}
