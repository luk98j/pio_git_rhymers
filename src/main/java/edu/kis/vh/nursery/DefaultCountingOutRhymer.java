package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE_OF_TABLE = 12;
	private static final int LAST_INDEX_OF_TABLE = SIZE_OF_TABLE - 1;
	private final int[] numbers = new int[SIZE_OF_TABLE];

	private int INITIAL_VALUE = -1;
	private final int RETURN_VALUE = -1;

	protected void countIn(int in) {
		if (!isFull()) {
			numbers[++INITIAL_VALUE] = in;
		}
	}

	protected boolean callCheck() {
		return INITIAL_VALUE == RETURN_VALUE;
	}
		
	protected boolean isFull() {
		return INITIAL_VALUE == LAST_INDEX_OF_TABLE;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return RETURN_VALUE;
		} else {
			return numbers[INITIAL_VALUE];
		}
	}
			
	protected int countOut() {
		if (callCheck()) {
			return RETURN_VALUE;
		} else {
			return numbers[INITIAL_VALUE--];
		}
	}

}
