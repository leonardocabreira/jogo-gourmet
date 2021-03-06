package util;

import model.Categoria;
import model.No;
import model.Prato;

/**
 *
 * @author Leonardo Cabreira
 */

public class FactoryGame {

	public static No factoryGame() {

		No lasanha = new No(new Prato("Lasanha"), null, null);
		No bolo    = new No(new Prato("Bolo de Chocolate"), null, null);
		No massa   = new No(new Categoria("Massa"), lasanha, bolo);

		return massa;

	}
}
