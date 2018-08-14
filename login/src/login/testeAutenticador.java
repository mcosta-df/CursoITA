package login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testeAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador  a = new Autenticador();
		Usuario u = a.logar("guerra", "senhadogerra");
		
		assertEquals("guerra", u.getLogin());
	}
	
	@Test
	public void loginCComFalha() throws LoginException {
		Autenticador  a = new Autenticador();
	
		Assertions.assertThrows(LoginException.class, () -> {
			 a.logar("guerra", "senha");
		});
	}
	
	@Test
	public void informacaoDoErro() {
		Autenticador  a = new Autenticador();
		
		try {
			Usuario u = a.logar("guerra", "senha");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
	}

}
