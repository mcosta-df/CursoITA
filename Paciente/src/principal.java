
public class principal {

	public static void main(String[] args) {
		paciente p1 = new paciente(1.80, 50.0);
		paciente p2 = new paciente(1.50, 100.0);
		paciente p3 = new paciente(1.90, 70.0);
		
		System.out.println("paciente 1: " + p1.diagnostico());
		System.out.println("paciente 2: " + p2.diagnostico());
		System.out.println("paciente 3: " + p3.diagnostico());

	}

}