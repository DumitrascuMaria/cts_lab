package ro.ase.cts.seminar12.observer;




public interface Transferable {
	public abstract void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException;
}
