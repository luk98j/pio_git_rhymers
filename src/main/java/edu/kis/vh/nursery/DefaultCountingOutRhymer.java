package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	public int total = -1;
	final int NEGATIVE_ONE = 1;
	final int POSITIVE_ELEVEN = 11;

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == NEGATIVE_ONE;
	}
		
	public boolean isFull() {
		return total == POSITIVE_ELEVEN;
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
