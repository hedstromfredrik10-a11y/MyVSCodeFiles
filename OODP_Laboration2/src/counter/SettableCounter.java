package counter;

public class SettableCounter extends CircularCounter implements SettableCounterType {

	public SettableCounter(int maxNrOfCounts, Direction direction, CounterType nextCounter) {
		super(maxNrOfCounts, direction, nextCounter);
	}

	@Override
	public void setCount(int value) {
		if (value < MAX_NR_OF_COUNTS && value != currentCount) {
			currentCount = value;
		}
	}
}
