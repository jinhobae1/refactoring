package refactoring.chapter13;

import java.util.Random;

public class Dice {
	private final Random random;

	public Dice() {
		random = new Random(314159L);
	}

	public Dice(long seed) {
		random = new Random(seed);
	}

	public void setSeed(long seed) {
		random.setSeed(seed);
	}

	public int nextInt() {
		return random.nextInt(6) + 1;
	}

	public void nextBytes(byte[] bytes) {
		throw new UnsupportedOperationException();
	}

	public long nextLong() {
		throw new UnsupportedOperationException();
	}

	public float nextFloat() {
		throw new UnsupportedOperationException();
	}

	public double nextDouble() {
		throw new UnsupportedOperationException();
	}

	public double nextGaussian() {
		throw new UnsupportedOperationException();
	}

}
