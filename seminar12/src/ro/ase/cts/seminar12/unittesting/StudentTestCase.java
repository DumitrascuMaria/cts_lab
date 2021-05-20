package ro.ase.cts.seminar12.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestCase {

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
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}

	@Test
	void testStudentConstructorRight() {
		String studentName="Maria";
		int studentAge=21;
		int grades[]= {8,8,9};
		Student student=new Student(studentName,studentAge,grades);
		assertEquals(studentName,student.nume,"Name is not equal"); //1 param=val asteptata, 2=val actuala care trb ret
		assertEquals(studentAge,student.varsta,"Age is not equal");
		assertEquals(grades,student.note,"Grades are not equal");
	}
	
	void anotherTest() { //nu va fi executat pt ca nu are @Test
		
	}
	
	@Test
	void test2() {//in junit3 era considerat test fara adnotare deoarece insepea cuc uv test
		fail("Not yet implemented -test2");
	}

}
