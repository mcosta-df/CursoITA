package login;

public class Autenticador {
	public Usuario logar(String login, String senha) throws LoginException{
		if( login.equals("guerra") && senha.equals("senhadogerra")) {
			return new Usuario(login);
		}
		
		throw new LoginException("senha nao bate", login);
	}
}
