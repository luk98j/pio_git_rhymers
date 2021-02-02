package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE_OF_TABLE = 12;
	private static final int LAST_INDEX_OF_TABLE = SIZE_OF_TABLE - 1;
	private final int[] numbers = new int[SIZE_OF_TABLE];

	private int initialValue = -1;
	private static final int RETURN_VALUE = -1;

	public int getInitialValue() {
		return initialValue;
	}

	protected void countIn(int in) {
		if (!isFull()) {
			numbers[++initialValue] = in;
		}
	}

	protected boolean callCheck() {
		return initialValue == RETURN_VALUE;
	}
		
	protected boolean isFull() {
		return initialValue == LAST_INDEX_OF_TABLE;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return RETURN_VALUE;
		} else {
			return numbers[initialValue];
		}
	}
			
	protected int countOut() {
		if (callCheck()) {
			return RETURN_VALUE;
		} else {
			return numbers[initialValue--];
		}
	}

}
