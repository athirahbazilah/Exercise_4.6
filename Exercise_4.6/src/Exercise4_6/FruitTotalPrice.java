package Exercise4_6;

class AppleTotalPrice implements Price {
	
	public double totalPrice(int Q) {
		return 1.00 * Q;
	}
	
	public double totalPrice(int Q, double Disc) {
		return (0.8 * Q) - (0.8 * Q * Disc);
	}

}

class AvocadoTotalPrice implements Price {
	
	public double totalPrice(int Q) {
		return 1.00 * Q;
	}
	
	public double totalPrice(int Q, double Disc) {
		return (0.8 * Q) - (0.8 * Q * Disc);
	}
}

class RedAppleTotalPrice implements Price {
	
	public double totalPrice(int Q) {
		return 1.00 * Q;
	}
	
	public double totalPrice(int Q, double Disc) {
		return (0.8 * Q) - (0.8 * Q * Disc);
	}
}

class GreenAppleTotalPrice implements Price {
	
	public double totalPrice(int Q) {
		return 1.00 * Q;
	}
	
	public double totalPrice(int Q, double Disc) {
		return (0.8 * Q) - (0.8 * Q * Disc);
	}
}