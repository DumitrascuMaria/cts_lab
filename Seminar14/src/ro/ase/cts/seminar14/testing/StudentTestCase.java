package ro.ase.cts.seminar14.testing;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentExceptionWWrongValue;

class StudentTestCase {
	//text fixtures
		static Student student;
		static String DEFAULT_NAME="Anonim";
		static int DEFAULT_VARSTA=18;
		static int DEFAULT_NOTE[];
		static int NR_NOTE_DEFAULT=3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
		DEFAULT_NOTE=new int[NR_NOTE_DEFAULT];
		DEFAULT_NOTE[0]=9;
		DEFAULT_NOTE[1]=9;
		DEFAULT_NOTE[2]=10;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new Student(DEFAULT_NAME,DEFAULT_VARSTA,DEFAULT_NOTE);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//ORDONANCE
	@Test
	void test() throws StudentExceptionWWrongValue {
		//specific testului de ordonance este faptul ca inputul 
		//este dat intr o anumita ordine
		int note[]= {10,9,8,7,6};
		student.setNote(note);
		float medie=student.calculMedie();
		float expectedValue=8;
		assertEquals(expectedValue,medie,"Media nu corespunde");
		
	}
	
	//cardinality-zero elem
	@Test
	void testCalculMedieCardinalityZero() { //ce se intampla cand nu avem note
		int note[]=new int[3];
		//are dim, dar nu contine niciun elem
		try {
			student.setNote(note);
		} catch (StudentExceptionWWrongValue e) {
			fail("Exceptie generata de setNote");
		}
		assertThrows(StudentExceptionWWrongValue.class,()->{
			student.calculMedie();
		});
	}
	
	//cartinality test - 1 elem
	@Test
	void testCalculMedieCardinalityOne() {
		int note[]=new int[1];
		note[0]=9;
		//are dim, dar nu contine niciun elem
		try {
			student.setNote(note);
		} catch (StudentExceptionWWrongValue e) {
			fail("Exceptie generata de setNote");
		}
		assertThrows(StudentExceptionWWrongValue.class,()->{
			student.calculMedie();
		});
		
	}
	
	//test de cardinalitate cu mai multe elem este echiv cu right sau ordonance
	

}
