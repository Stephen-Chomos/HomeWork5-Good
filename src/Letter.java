
public class Letter {
	private char let;
	private int count;
	private double freq;
	
	public Letter(char in) {
		let = in;
		count = 1;
		freq = 0.0;
	}

	public double getFreq() {
		return freq;
	}

	public void setFreq(int total) {
		double dTotal = total;
		double dCount = count;
		freq = (dCount / dTotal) * 100;
	}

	public char getLet() {
		return let;
	}

	public int getCount() {
		return count;
	}
	
	public void addCount() {
		++count;
	}
	
	public void print() {
		System.out.println(let + ": " + freq + "%");
	}
}
