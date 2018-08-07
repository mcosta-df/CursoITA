
public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		
		corridaDaAmizade.adicionarCarro(new CarroSoma("CarroA", 10, 110));
		corridaDaAmizade.adicionarCarro(new CarroSoma("CarroA", 8, 110));
		corridaDaAmizade.adicionarCarro(new CarroMult("CarroC", 1.7, 100));
		corridaDaAmizade.adicionarCarro(new CarroMult("CarroD", 1.4, 110));
		corridaDaAmizade.umDoisTresEJa();
	}

}
