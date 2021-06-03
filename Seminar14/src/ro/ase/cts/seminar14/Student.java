package ro.ase.cts.seminar14;

import ro.ase.cts.seminar14.StudentExceptionWWrongValue;


public class Student extends StudentAbstract{

	//constraints=> nume=[3-255] caractere, varsta [18-30], note [1-10]
	
	private static final int NOTA_MAX=10;
	private static final int NOTA_MIN=1;
	public Student(String nume, int varsta, int[] note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) throws StudentExceptionWWrongValue {
		if(varsta<0)
			throw new StudentExceptionWWrongValue("valorile nu pot fi negative");
		this.varsta = varsta;
	}
	public int[] getNote() {
		return note;
	}
	public void setNote(int[] note) throws StudentExceptionWWrongValue {
		if(note!=null) {
			
		
		for(int i=0;i<note.length;i++) {
			if(note[i]>NOTA_MAX||note[i]<NOTA_MIN) {
				throw new StudentExceptionWWrongValue("Invalid input for nota -"+note[i]);
			}
		}
		
		}
		this.note = note;
	}
	
	@Override
	public float calculMedie() throws StudentExceptionWWrongValue{
		if(note==null) {
			throw new StudentExceptionWWrongValue("empty dataset-note");
		}
		if(note.length<=1) {
			throw new StudentExceptionWWrongValue("nu sunt suficiente note");
		}
		float suma=0;
		for(int i=0;i<note.length;i++) {
			suma+=note[i];
		}
		float medie=suma/note.length;
		return (int)(medie*100)/100.0f;
	}
	
	
}
