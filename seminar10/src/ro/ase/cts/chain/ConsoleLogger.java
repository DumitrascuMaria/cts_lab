package ro.ase.cts.chain;

public class ConsoleLogger extends AbstractLogger {
	public ConsoleLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
	}

	@Override
	void write(String message) {
		System.out.println(ConsoleLogger.class.getName() + " : " + message);
	}
}
