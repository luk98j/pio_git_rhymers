package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TWELVE = 12;
	private final int[] numbers = new int[TWELVE];

	public int total = -1;
	final int NEGATIVE_ONE = 1;

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == NEGATIVE_ONE;
	}
		
	public boolean isFull() {
		return total == TWELVE - 1;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return NEGATIVE_ONE;
		} else {
			return numbers[total];
		}
	}
			
	public int countOut() {
		if (callCheck()) {
			return NEGATIVE_ONE;
		} else {
			return numbers[total--];
		}
	}

}
