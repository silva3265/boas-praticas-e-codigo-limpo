package boas_praticas_clean_code;

public class Contribuinte {

	// Conforme Lei XYZ
	static final int IDADE_MINIMA_APOSENTADORIA = 65;

	int idade;
	int tempoContribuicaoEmAnos;

	boolean estaElegivelParaAposentadoria() {
		return idade >= IDADE_MINIMA_APOSENTADORIA;
	}

}
