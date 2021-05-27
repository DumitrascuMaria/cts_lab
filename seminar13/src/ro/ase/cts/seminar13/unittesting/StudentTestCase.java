package ro.ase.cts.seminar13.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.exceptions.StudentExceptionWWrongValue;

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
		System.out.println("tearDownAfterclass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp was called");
		student=new Student(DEFAULT_NAME,DEFAULT_VARSTA,DEFAULT_NOTE);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}

	//right/conformance test
	@Test
	void testStudentConstructorRight() {
		String studentName="Maria";
		int studentAge=21;
		int grades[]= {8,8,9};
		Student student=new Student(studentName,studentAge,grades);
		assertEquals(studentName,student.getNume(),"Name is not equal"); //1 param=val asteptata, 2=val actuala care trb ret
		assertEquals(studentAge,student.getVarsta(),"Age is not equal");
		assertEquals(grades,student.getNote(),"Grades are not equal");
	}
	
	@Test
	void testStudentConstructorRightNotNull() {
		int grades[]= {8,8,9};
		Student student=null;
		try {
		student=new Student("Maria",22,grades);
		}
		catch(Exception e){
			fail("Constructorul nu trb sa arunce exceptie");
		}
		assertNotNull(student);
	}
	
	void anotherTest() { //nu va fi executat pt ca nu are @Test
		
	}
	
//	@Test
//	void test2() {//in junit3 era considerat test fara adnotare deoarece insepea cuc uv test
//		fail("Not yet implemented -test2");
//	}
	
	//error condition sau din correct=existance
	@Test()
	void testStudentSetVarstaErrorCondition() {
//		try{
//			student.setVarsta(-1);
//			fail("Expected an exception");
//		}catch(StudentExceptionWWrongValue ex) {
//			
//		}
	
		assertThrows(StudentExceptionWWrongValue.class,new Executable() {

			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				student.setVarsta(-1);
				
			}
		});
	}
	
	@Test
	void testStudentGetVarstaRight() {
		int expectedValue=DEFAULT_VARSTA;
		int actualValue=student.getVarsta();
		assertEquals(expectedValue,actualValue);
	}

	@Test
	void testCalculMedieErrorCondition() {
		try {
			student.setNote(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(StudentExceptionWWrongValue.class,()->{
			student.calculMedie();	
			});
	}
	
	@Test
	void testCalculMedieRightDouaZecimale() throws StudentExceptionWWrongValue {
		float expectedValue=9.33f;
		float actualValue=student.calculMedie();
		assertEquals(expectedValue,actualValue);
		
	}
	
	//boundary check
	@Test
	void testSetNoteBoundaryCondition() {
		int invalidDataSetNote[]=new int[3];
		for(int i=0;i<2;i++) {
			invalidDataSetNote[i]=8;
		}
		invalidDataSetNote[2]=20;
		assertThrows(StudentExceptionWWrongValue.class,()->{
			student.setNote(invalidDataSetNote);
		});
	}
}
