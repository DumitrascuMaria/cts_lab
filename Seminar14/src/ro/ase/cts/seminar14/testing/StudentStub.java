package ro.ase.cts.seminar14.testing;

import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExceptionWWrongValue;

public class StudentStub extends StudentAbstract{

	float calculMedieReturnValue=0;
	boolean exceptionalCase=false;
	
	public void setCalculMedieReturnValue(float calculMedieReturnValue) {
		this.calculMedieReturnValue = calculMedieReturnValue;
	}
	

	public void setExceptionalCase(boolean exceptionalCase) {
		this.exceptionalCase = exceptionalCase;
	}


	@Override
	public float calculMedie() throws StudentExceptionWWrongValue {
		// TODO Auto-generated method stub
		if(exceptionalCase) {
			throw new StudentExceptionWWrongValue("exceptie calcul medie");
		}
		return calculMedieReturnValue;
	}

}
