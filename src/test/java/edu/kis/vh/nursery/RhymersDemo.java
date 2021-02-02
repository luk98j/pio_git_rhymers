package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

import java.util.Random;

class RhymersDemo {

	private static final int VERY_GOOD_FIFTEEN = 15;
	private static final int HEPFUL_THREE = 3;
	private static final int RANDOM_BUT_TWENTY = 20;

	public static void main(String[] args) {
		Rhymersfactory rhymersFactory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { rhymersFactory.getStandardRhymer(), rhymersFactory.getFalseRhymer(),
				rhymersFactory.getFIFORhymer(), rhymersFactory.getHanoiRhymer()};
		Random random = new Random();
		for (int i = 1; i < VERY_GOOD_FIFTEEN; i++) {
			for (int j = 0; j < HEPFUL_THREE; j++) {
				rhymers[j].countIn(i);
			}
		}

		for (int i = 1; i < VERY_GOOD_FIFTEEN; i++) {
			rhymers[HEPFUL_THREE].countIn(random.nextInt(RANDOM_BUT_TWENTY));
		}
		for (DefaultCountingOutRhymer rhymer : rhymers) {
			while (!rhymer.callCheck()) {
				System.out.print(rhymer.countOut() + "  ");
			}
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[HEPFUL_THREE]).reportRejected());
		
	}
	
}