package counter;

public interface CounterType {
	void count();

	void resume();

	void pause();

	int getCount();

	void reset();
		
}