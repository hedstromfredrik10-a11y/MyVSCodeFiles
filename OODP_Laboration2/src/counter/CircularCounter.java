package counter;

public abstract class CircularCounter implements CounterType{

	protected enum Direction {
		INCREASING, DECREASING
	};

	protected int currentCount;
	private boolean isPaused;
	protected final int MAX_NR_OF_COUNTS;
	private Direction direction;
	private CounterType nextCounter;

	public CircularCounter(int maxNrOfCounts, Direction direction, CounterType nextCounter) {
		this.direction = direction;
		this.nextCounter = nextCounter;

		if (maxNrOfCounts < 2) {
			this.MAX_NR_OF_COUNTS = 0;
		} else {
			this.MAX_NR_OF_COUNTS = maxNrOfCounts;
		}

		if (this.direction == Direction.DECREASING && this.MAX_NR_OF_COUNTS > 0) {
			currentCount = MAX_NR_OF_COUNTS - 1;
		}
	}

	public int getCount() {
		return currentCount;
	}

	public void reset() {
		currentCount = 0;
	}

	public void pause() {
		isPaused = true;
	}

	public void resume() {
		isPaused = false;
	}
	
	public void count() {
		if (!isPaused && this.MAX_NR_OF_COUNTS > 0) {
			if (direction == Direction.INCREASING) {
				currentCount++;
				if (currentCount >= MAX_NR_OF_COUNTS) {
					currentCount = 0;
					if (nextCounter != null) {
						nextCounter.count();
					}
				}
			} 
			else if (direction == Direction.DECREASING) {
				currentCount--;
				if (currentCount < 0) {
					currentCount = MAX_NR_OF_COUNTS - 1;
					if (nextCounter != null) {
						nextCounter.count();
					}
				}
			}
		}
	}

	public String toString() {
		return String.valueOf(currentCount);
	}

}
