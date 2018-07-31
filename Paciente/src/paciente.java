
public class paciente {
	double peso;
	double altura;
	
	public paciente(double altura, double peso) {
		setPeso(peso);
		setAltura(altura);
	}

	private void setAltura(double altura) {
		this.altura = altura;
		
	}

	private void setPeso(double peso) {
		this.peso = peso;
		
	}
	
	public double calculaIMC() {
		return peso / (altura * altura);		
	}
	
	public String diagnostico() {
		double imc;
		
		imc = calculaIMC();
		
		if( imc < 16 ) {
			return "Baixo peso muito grave";
		}else if( imc >= 16 && imc < 17 ) {
			return "Baixo peso grave";
		}else if( imc >= 17 && imc < 18.50) {
			return "Baixo Peso";
		}else if( imc >= 18.50 && imc < 25 ) {
			return "Peso normal";
		}else if(imc >= 25 && imc < 30 ) {
			return "Sobrepeso";
		}else if( imc >= 30 && imc < 35 ) {
			return "Obesidade grau I";
		}else if( imc >= 35 && imc < 40 ) {
			return "Obesidade grau II";
		}else {
			return "Obesidade grau III(obesidade morbida)";
		}
	}
}