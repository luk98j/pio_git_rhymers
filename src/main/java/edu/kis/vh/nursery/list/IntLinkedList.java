package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private final static int RETURN_VALUE = -1;
	
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty()) {
			return RETURN_VALUE;
		} else {
			return last.getValue();
		}
	}

	public int pop() {
		if (isEmpty()) {
			return RETURN_VALUE;
		}else {
			int ret = last.getValue();
			last = last.getPrev();
			return ret;
		}
	}

}
