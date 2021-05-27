package ro.ase.cts.seminar13.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.exceptions.StudentExceptionWWrongValue;

class StudentTestCase {

	//text fixtures
	Student student;
	String defaultName="Anonim";
	int defaultVarsta=18;
	int defaultNote[]= {};
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterclass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp was called");
		student=new Student(defaultName,defaultVarsta,defaultNote);
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
	

	@Test(expected=StudentExceptionWWrongValue.class)
	void testStudentSetVarstaErrorCondition() {
//		try{
//			student.setVarsta(-1);
//			fail("Expected an exception");
//		}catch(StudentExceptionWWrongValue ex) {
//			
//		}
		student.setVarsta(-1);
	}

}
