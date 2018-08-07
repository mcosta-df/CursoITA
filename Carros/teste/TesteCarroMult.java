import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteCarroMult {

CarroDeCorrida c;
	
	@BeforeEach
	public void inicializaCarro() {
		c = new CarroMult("teste", 1.5, 100);
		
	}
	
	
	@Test
	public void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarUmaVez() {
		c.acelarar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarDiasVzes() {
		c.acelarar();
		c.acelarar();
		assertEquals(15, c.getVelocidade());
	}
	
	
	@Test
	public void testFrear() {
		c.acelarar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {
		c.acelarar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		for( int i = 0; i < 14; i++) {
			c.acelarar();
		}
		assertEquals(100, c.getVelocidade());
	}

}
