package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Cabreira
 */

public class Mensageiro {

	public static boolean mensagem(String mensagem, String titulo, String op1, String op2) {
		String[] opcoes = { op1, op2 };
		return  JOptionPane.showOptionDialog(null
		                                   , mensagem
		                                   , titulo
		                                   , JOptionPane.DEFAULT_OPTION
		                                   , JOptionPane.QUESTION_MESSAGE
		                                   , null
		                                   , opcoes
		                                   , opcoes[0]) == 0;

		
	}

	public static boolean perguntar(String descricao) {
		String[] opcoes = { "SIM", "NAO" };
		return JOptionPane.showOptionDialog(null
				                                  , "O prato que você pensou é " + descricao + "?"
				                                  , "Confirmar"
				                                  ,	JOptionPane.DEFAULT_OPTION
				                                  , JOptionPane.QUESTION_MESSAGE
				                                  , null
				                                  , opcoes
				                                  , opcoes[0]) == 0;

		
	}

	public static String desistir() {
		String resposta = JOptionPane.showInputDialog(null
				                                    , "Qual prato você pensou?"
				                                    , "Desisto"
				                                    , JOptionPane.QUESTION_MESSAGE);
		return resposta;
	}

	public static String completeAFrase(String descricao1, String descricao2) {

		String resposta = JOptionPane.showInputDialog(null
				                                    , descricao1 + " é ____________ mas " + descricao2 + " não."
				                                    , "Complete", JOptionPane.QUESTION_MESSAGE);
		return resposta;

	}

}
