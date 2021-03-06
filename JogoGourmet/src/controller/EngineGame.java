package controller;
import model.Categoria;
import model.No;
import model.Prato;
import util.FactoryGame;
import view.Mensageiro;


/**
*
* @author Leonardo Cabreira
*/
public class EngineGame {

	private No raiz;

	public EngineGame() {
		raiz = FactoryGame.factoryGame();
	}
	

	public void start() {
		proximoNo(raiz);
	}
	

	public No proximoNo(No noAtual) {
		
		No novoNo;
		
		
		if (Mensageiro.perguntar(noAtual.getObjetoGenerico().getDescricao())) {
		
			if (noAtual.getDireita() == null) {
				Mensageiro.mensagem("Acertei Novamente!", "Jogo Gourmet", "OK", "Cancelar");
				novoNo = null;
				
			} else {
				novoNo = proximoNo(noAtual.getDireita());
				if (novoNo != null) {
					noAtual.setDireita(novoNo);
					novoNo = null;
				}
			}

			}else  {
	
			if (noAtual.getEsquerda() == null) {
				novoNo = criarNovoRamo(noAtual);
			} else {
				novoNo = proximoNo(noAtual.getEsquerda());
				if (novoNo != null) {
					noAtual.setEsquerda(novoNo);
					novoNo = null;
				}
			}
		}	
			
		return novoNo;
	}
	
	

	public No criarNovoRamo(No noAtual) {

		String novoValor = Mensageiro.desistir();

		if (novoValor != null) {
			novoValor = novoValor.trim();

			if (!novoValor.equals("")) {

				No novo = new No(new Prato(novoValor), null, null);
				String caracteristica = Mensageiro.completeAFrase(novoValor, noAtual.getObjetoGenerico().getDescricao());

				No novoRamo = new No(new Categoria(caracteristica), novo, noAtual);

				return novoRamo;
			}
		}
		return null;

	}
}
