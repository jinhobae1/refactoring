package refactoring.chapter13;

import java.util.Random;

public class Dice extends Random {
	public Dice() {
		super(314159L);
	}

	public Dice(long seed) {
		super(seed);
	}

	@Override
		public int nextInt() {
			return nextInt(6)+1;
		}

	/*@Override
		public void nextBytes(byte[])bytes	{
			throw new UnsupportedOperationException();
		}
		@Override
		public long nextLong() {
			t
		}
*/
	}