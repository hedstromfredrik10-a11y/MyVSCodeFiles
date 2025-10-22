package Lab1;

// import Alarmklocka.CircularCounter.Direction;

public class Counter60 extends CircularCounter {
	public Counter60() {
		this(Direction.INCREASING, null);
	}

	public Counter60(CounterType next) {
		this(Direction.INCREASING, next);
	}

	public Counter60(Direction direction) {
		this(direction, null);
	}

	public Counter60(Direction direction, CounterType next) {
		super(24, direction, next);
	}
}
