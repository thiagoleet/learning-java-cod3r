package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 1_234_845_223L; // sufixo L é para literal long

		// Tipos numéricos reais
		float salario = 11_445.44F; // sufixo F para literal float
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false;

		// Tipo caractere
		char status = 'A';

		// Dia de empresa
		System.out.println("Dia de empresa: " + (anosDeEmpresa * 365));

		// Número de viagens
		System.out.println("Número de viagens: " + (numeroDeVoos / 2));

		// Pontos por real
		System.out.println("Pontos por real: " + (pontosAcumulados / vendasAcumuladas));

		System.out.println(id + " ganha -> " + salario);

		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);

	}
}
