package Exercise4_6;

class AppleDiscount implements Discount { //discount for Apple
	//apple discount is a sub 
	
	public double discountRate() { //method implement
		return 0.2;
	}
}
	
	class RedAppleDiscount implements Discount { //discount for Red Apple
		
		public double discountRate() { //method implement
			return 0.1;
		}
	}
	
	class GreenAppleDiscount implements Discount { //discount for Green Apple
		
		public double discountRate() { //method implement
			return 0.15;
		}
	}
	
	class AvocadoDiscount implements Discount { //discount for Avocado
		
		public double discountRate() {
			return 0.2;
		}

}
