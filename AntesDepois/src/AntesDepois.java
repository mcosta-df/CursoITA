


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AntesDepois {

	@BeforeAll
	public static void anteTudo() {
		System.out.println("@beforeClass");
	}
	
	@AfterAll
	public static void depoisDeTudo() {
		System.out.println("@AfterClass");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("@Before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("@After");
	}
	
	@Test
	public void test1() {
		System.out.println("Teste 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Teste 3");
	}

}
