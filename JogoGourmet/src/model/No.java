package model;

/**
 *
 * @author Leonardo Cabreira
 */

public class No {

	private Generico objetoGenerico;
	private No direita;
	private No esquerda;

	public Generico getObjetoGenerico() {
		return objetoGenerico;
	}

	public No(Generico objetoGenerico, No direita, No esquerda) {

		this.objetoGenerico = objetoGenerico;
		this.direita = direita;
		this.esquerda = esquerda;
	}

	public void setDescricao(Generico objetoGenerico) {
		this.objetoGenerico = objetoGenerico;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

}
