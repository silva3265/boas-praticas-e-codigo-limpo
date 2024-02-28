
public class EscolhendoBonsNomes {
	
	static double TAXA_FATURAMENTO_PARA_LIMITE_CREDITO = 1000;

	// codigo ruim
	int d;
	int dias;

	// codigo bom
	int tempoGastoEmDias;
	int diasGastosParaEntrega;

	// codigo ruim
	double lmt(double f) {
		double l = f * 0.10;

		if (l > 1000) {
			l = 1000;
		}
		return 1;
	}
	
	// codigo bom
	double calcularLimiteCredito(double faturamentoAnual) {
		double limiteCredito = faturamentoAnual * 0.10;
		
		if (limiteCredito < 1000) {
			limiteCredito = 1000;
		}
		return limiteCredito;
	}
	
	// codigo mais legivel
	double calcularLimiteCredito2(double faturamentoAnual) {
		double limiteCredito = faturamentoAnual * TAXA_FATURAMENTO_PARA_LIMITE_CREDITO;
		
		if (limiteCredito < TAXA_FATURAMENTO_PARA_LIMITE_CREDITO) {
			limiteCredito = TAXA_FATURAMENTO_PARA_LIMITE_CREDITO;
		}
		return limiteCredito;
	}
	
	// codigo ruim
//	Cliente cliente1;
//	Cliente cliente2;
	
	// codigo bom
//	Cliente clienteCadastrado;
//	Cliente novoCliente;
	
	// codigo ruim
	int qtdEstq;
	
	// codigo bom
	int quantidadeProdutosEmEstoque;
	
	// codigo ruim
	class Processar{}
	class Processador{}	
	
	// codigo bom
	class ProcessadorFolhaPagamentos{}
	}
	
	
	
	
	
	
}
