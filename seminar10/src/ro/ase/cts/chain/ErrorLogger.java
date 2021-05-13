package ro.ase.cts.chain;

public class ErrorLogger extends AbstractLogger {
	public ErrorLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
	}

	@Override
	void write(String message) {
		System.err.println(ErrorLogger.class.getName() + " : " + message);
	}
}
